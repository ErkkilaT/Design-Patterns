public class MoveCursorRightCommand implements Command{
    private Cursor cursor;
    public MoveCursorRightCommand(Cursor c){
        this.cursor = c;
    }
    @Override
    public void execute() {
        cursor.move(0,1);
    }
}
