class WildernessMap extends Map{
    @Override
    public Tile createTile() {
        int rand = (int)(Math.random()*3);
        if (rand == 0){
            return new ForestTile(TileGraphicFactory.getTileImage(TileType.FOREST));
        }
        else if (rand == 1){
            return new SwampTile(TileGraphicFactory.getTileImage(TileType.SWAMP));
        }
        else if (rand == 2){
            return new WaterTile(TileGraphicFactory.getTileImage(TileType.WATER));
        }
        return null;
    }
}
