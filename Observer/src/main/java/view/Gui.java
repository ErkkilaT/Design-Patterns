package view;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import model.WeatherStation;

public class Gui extends Application {

    private WeatherStation station = new WeatherStation();




    @Override
    public void start(Stage primaryStage){
        Label text1 = new Label("Hello");
        Text text = new ObservingText(station);
        Button button = new ObservingButton(station);


        FlowPane root = new FlowPane();
        root.getChildren().add(text);
        root.getChildren().add(button);
        Scene view = new Scene(root);
        primaryStage.setTitle("WeatherStation");
        primaryStage.setScene(view);
        primaryStage.show();
    }
}
