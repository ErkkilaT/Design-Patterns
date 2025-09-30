class CityMap extends Map {
    @Override
    public Tile createTile() {
        int rand = (int)(Math.random()*3);
        if (rand == 0){
            return new ForestTile(TileGraphicFactory.getTileImage(TileType.FOREST));
        }
        else if (rand == 1){
            return new RoadTile(TileGraphicFactory.getTileImage(TileType.ROAD));
        }
        else if (rand == 2){
            return new BuildingTile(TileGraphicFactory.getTileImage(TileType.BUILDING));
        }
        return null;
    }
}
