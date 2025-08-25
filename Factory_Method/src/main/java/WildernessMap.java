class WildernessMap extends Map{
    @Override
    public Tile createTile() {
        int rand = (int)(Math.random()*3);
        if (rand == 0){
            return new ForestTile();
        }
        else if (rand == 1){
            return new SwampTile();
        }
        else if (rand == 2){
            return new WaterTile();
        }
        return null;
    }
}
