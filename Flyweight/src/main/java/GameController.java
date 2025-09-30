import javafx.scene.image.Image;

public class GameController {
    private Map map;
    private static final int GRID_SIZE = 10;

    public GameController(){
        map = new WildernessMap();
        map.display();
    }
    public int getGridSize(){
        return GRID_SIZE;
    }
    public Image getTileImage(int i, int j){
        return map.getTileImage(i,j);
    }


}
