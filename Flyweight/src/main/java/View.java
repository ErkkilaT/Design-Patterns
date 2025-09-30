import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.canvas.Canvas;

public class View extends Application {
    private static final int TILE_SIZE = 50;
    private GameController controller = new GameController();
    private final int CANVAS_SIZE = controller.getGridSize() * TILE_SIZE;
    private Canvas canvas = new Canvas(CANVAS_SIZE, CANVAS_SIZE);
    private GraphicsContext gc = canvas.getGraphicsContext2D();


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("GameMap");
        drawMap();
        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        stage.setScene(new Scene(root));
        stage.show();

    }
    private void drawMap(){
        gc.clearRect(0,0,CANVAS_SIZE, CANVAS_SIZE);
        for(int i = 0; i< controller.getGridSize(); i++){
            for(int j = 0; j< controller.getGridSize(); j++){
                Image image = controller.getTileImage(i,j);
                gc.drawImage(image, j*TILE_SIZE,i*TILE_SIZE,TILE_SIZE,TILE_SIZE);
            }
        }
    }
}
