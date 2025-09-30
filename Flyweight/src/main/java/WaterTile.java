import javafx.scene.image.Image;

class WaterTile implements Tile{
    private TileImage tileImage;
    public WaterTile(TileImage tileImage){
        this.tileImage = tileImage;
    }
    @Override
    public char getCharacter(){
        return 'W';
    }
    @Override
    public String getDescription(){
        return "water";
    }
    @Override
    public void action(){

    }
    public Image getTileImage(){
        return tileImage.getImage();
    }
}