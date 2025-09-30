import javafx.scene.image.Image;

abstract class Map {
    private Tile[][] map;
    public Map(){
        map = new Tile[10][10];
        for(int i =0;i<10;i++){
            for(int j=0;j<10;j++){
                map[i][j] = createTile();
            }
        }
    }
    public abstract Tile createTile();


    public void display(){
        for(int i =0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(map[i][j].getCharacter() +" ");
            }
            System.out.println();
        }

    }
    public Image getTileImage(int i, int j){
        return map[i][j].getTileImage();
    }
}
