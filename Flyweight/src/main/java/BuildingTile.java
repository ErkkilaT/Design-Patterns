import javafx.scene.image.Image;

class BuildingTile implements Tile{
    private TileImage tileImage;
    public BuildingTile(TileImage tileImage){
        this.tileImage = tileImage;
    }
    @Override
    public char getCharacter(){
        return 'B';
    }
    @Override
    public String getDescription(){
        return "building";
    }
    @Override
    public void action(){

    }
    public Image getTileImage(){
        return tileImage.getImage();
    }
}