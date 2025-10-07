import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import java.awt.*;

public class Gui extends Application {
    private static final int GRID_SIZE = 8;
    private static final int CELL_SIZE = 60;


    @Override
    public void start(Stage stage){
        Rectangle[][] grid = new Rectangle[GRID_SIZE][GRID_SIZE];
        GridPane gridPane = new GridPane();

        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE, Color.WHITE);
                cell.setStroke(Color.GRAY);
                cell.setStrokeType(StrokeType.INSIDE);

                gridPane.add(cell, col, row);
                grid[row][col] = cell;
            }
        }


        Command printToConsole = new GenerateCodeCommand((grid));
        Button printCodeBtn = new Button("Create Code");
        printCodeBtn.setFocusTraversable(false);
        printCodeBtn.setOnAction(e -> {
            printToConsole.execute();
        });


        VBox root = new VBox(10, gridPane, printCodeBtn);
        Scene scene = new Scene(root);

        Cursor cursor = new Cursor(grid);
        Command up = new MoveCursorUpCommand(cursor);
        Command down = new MoveCursorDownCommand(cursor);
        Command left = new MoveCursorLeftCommand(cursor);
        Command right = new MoveCursorRightCommand(cursor);
        Command toggle = new TogglePixelCommand(cursor);


        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.UP) up.execute();
            else if(e.getCode() == KeyCode.DOWN) down.execute();
            else if(e.getCode() == KeyCode.LEFT) left.execute();
            else if(e.getCode() == KeyCode.RIGHT) right.execute();
            else if(e.getCode() == KeyCode.SPACE) toggle.execute();
        });

        gridPane.requestFocus();


        stage.setTitle("Command Demo");
        stage.setScene(scene);
        stage.show();
    }


}
