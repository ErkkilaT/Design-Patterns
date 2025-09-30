import javafx.scene.image.Image;

class RoadTile implements Tile{
    private TileImage tileImage;
    public RoadTile(TileImage tileImage){
        this.tileImage = tileImage;
    }
    @Override
    public char getCharacter(){
        return 'R';
    }
    @Override
    public String getDescription(){
        return "road";
    }
    @Override
    public void action(){

    }
    public Image getTileImage(){
        return tileImage.getImage();
    }
}