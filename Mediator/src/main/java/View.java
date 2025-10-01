import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

import java.util.List;


public class View extends Application {
    private Controller cont1 = new Controller("Mikko", this);
    private Controller cont2 = new Controller("Teemu", this);
    private Controller cont3 = new Controller("Mari", this);
    private ChatServer server = ChatServer.getInstance();


    public void start(Stage stage){
        server.addClient(cont1);
        server.addClient(cont2);
        server.addClient(cont3);

        Stage stage1 = makeStage(cont1);
        Stage stage2 = makeStage(cont2);
        Stage stage3 = makeStage(cont3);

        stage1.show();

        stage2.setX(stage1.getX()-600);
        stage2.setY(stage1.getY());
        stage2.show();

        stage3.setX(stage1.getX()+600);
        stage3.setY(stage1.getY());
        stage3.show();

    }

    public Stage makeStage(Controller cont){

        //make chatHistory
        TextArea textArea = new TextArea("Select a person from the list to chat with");
        textArea.setEditable(false);

        //make textField
        TextField textField = new TextField();
        textField.setPromptText("Enter text here:");


        //make User list
        List<String> users = server.getClientList();
        users.remove(cont.getUsername());
        ObservableList<String> observableList = FXCollections.observableArrayList(users);
        ListView listView = new ListView(observableList);


        //populate textArea on switching recipient
        listView.setOnMouseClicked(event -> {
            String selected = (String) listView.getSelectionModel().getSelectedItem();
            textArea.setText("");
            if(selected !=null){
                List<String> chatHistory = cont.getChatHistory(selected);
                if(chatHistory != null){
                    for(String s: chatHistory){
                        textArea.appendText(s + "\n");
                    }
                }else{
                    textArea.appendText("No chats with this person yet.");
                }
                cont.setCurrentChat(selected, textArea);

            }
        });

        //make Send Button
        Button button = new Button("Send");
        button.setOnAction(event-> {
            String selected = (String) listView.getSelectionModel().getSelectedItem();
            if(selected !=null){
                cont.sendMessage(selected, textField.getText());
                textField.clear();
                textArea.setText("");
                List<String> chatHistory = cont.getChatHistory(selected);
                if(chatHistory != null){
                    for(String s: chatHistory){
                        textArea.appendText(s + "\n");
                    }
                }else{
                    textArea.appendText("No chats with this person yet.");
                }

            }
        });

        textField.setOnAction(event -> button.fire());

        HBox bottom = new HBox(10, textField, button);
        bottom.setPrefHeight(40);
        HBox.setHgrow(textField, Priority.ALWAYS);
        listView.setPrefWidth(120);

        BorderPane root = new BorderPane();
        root.setLeft(listView);
        root.setCenter(textArea);
        root.setBottom(bottom);

        Scene scene = new Scene(root, 600, 400);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Chats for " + cont.getUsername());

        return stage;
    }

    public void updateChatHistory(String username, TextArea textArea, Controller cont){
        List<String> chatHistory = cont.getChatHistory(username);
        textArea.clear();
        if(chatHistory != null){
            for(String s: chatHistory){
                textArea.appendText(s + "\n");
            }
        }else{
            textArea.appendText("No chats with this person yet.");
        }
    }

}
