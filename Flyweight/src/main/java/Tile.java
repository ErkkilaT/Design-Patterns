import javafx.scene.image.Image;

interface Tile {
    char getCharacter();
    String getDescription();
    void action();
    Image getTileImage();
}
