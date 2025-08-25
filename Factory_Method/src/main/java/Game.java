class Game {
    public static Map createMap(int i){
        if(i == 0){
            return new WildernessMap();
        }
        else{
            return new CityMap();
        }
    }
    public static void main(String[] args) {
        Map map = createMap(1);
        map.display();

    }

}
