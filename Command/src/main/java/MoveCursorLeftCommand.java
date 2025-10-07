public class MoveCursorLeftCommand implements Command{
    private Cursor cursor;
    public MoveCursorLeftCommand(Cursor c){
        this.cursor = c;
    }
    @Override
    public void execute() {
        cursor.move(0,-1);
    }
}
