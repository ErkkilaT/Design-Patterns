import javafx.scene.shape.Rectangle;

public class TogglePixelCommand implements Command{
    private Cursor cursor;

    public TogglePixelCommand(Cursor c){
        this.cursor = c;
    }
    @Override
    public void execute() {
        cursor.toggle();
    }
}
