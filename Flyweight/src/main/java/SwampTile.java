import javafx.scene.image.Image;

class SwampTile implements Tile{
    private TileImage tileImage;
    public SwampTile(TileImage tileImage){
        this.tileImage = tileImage;
    }
    @Override
    public char getCharacter(){
        return 'S';
    }
    @Override
    public String getDescription(){
        return "swamp";
    }
    @Override
    public void action(){

    }
    public Image getTileImage(){
        return tileImage.getImage();
    }
}
