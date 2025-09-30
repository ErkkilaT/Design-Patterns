import javafx.scene.image.Image;

class ForestTile implements Tile{
    private TileImage tileImage;
    public ForestTile(TileImage tileImage){
        this.tileImage = tileImage;
    }
    @Override
    public char getCharacter(){
        return 'F';
    }
    @Override
    public String getDescription(){
        return "forest";
    }
    @Override
    public void action(){

    }
    public Image getTileImage(){
        return tileImage.getImage();
    }
}