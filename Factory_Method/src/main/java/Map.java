abstract class Map {
    private Tile[][] map;
    public Map(){
        map = new Tile[15][15];
        for(int i =0;i<15;i++){
            for(int j=0;j<15;j++){
                map[i][j] = createTile();
            }
        }
    }
    public abstract Tile createTile();


    public void display(){
        for(int i =0;i<15;i++){
            for(int j=0;j<15;j++){
                System.out.print(map[i][j].getCharacter() +" ");
            }
            System.out.println();
        }

    }
}
