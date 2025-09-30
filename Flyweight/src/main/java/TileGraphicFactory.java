import java.util.EnumMap;
import java.util.Map;

public class TileGraphicFactory {
    private static final Map<TileType,TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType type){
        TileImage image = images.get(type);
        if(image == null){
            switch(type){
                case ROAD:
                    image = new TileImage("road_tile.png", "R");
                    break;
                case SWAMP:
                    image = new TileImage("swamp_tile.png", "S");
                    break;
                case WATER:
                    image = new TileImage("water_tile.png", "W");
                    break;
                case FOREST:
                    image = new TileImage("forest_tile.png", "F");
                    break;
                case BUILDING:
                    image = new TileImage("building_tile.png", "B");
                    break;
            }
            images.put(type, image);
        }
        return image;
    }
}
