import javafx.scene.image.Image;
public class TileImage {
    private final Image image;
    private final String symbol;
    public TileImage(String imagePath, String symbol){
        this.image = new Image(imagePath);
        this.symbol = symbol;
    }

    public Image getImage(){
        return image;
    }
    public String getSymbol(){
        return symbol;
    }
}
