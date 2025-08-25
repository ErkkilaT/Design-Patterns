class CityMap extends Map {
    @Override
    public Tile createTile() {
        int rand = (int)(Math.random()*3);
        if (rand == 0){
            return new ForestTile();
        }
        else if (rand == 1){
            return new RoadTile();
        }
        else if (rand == 2){
            return new BuildingTile();
        }
        return null;
    }
}
