public class MoveCursorUpCommand implements  Command{
    private Cursor cursor;
    public MoveCursorUpCommand(Cursor c){
        this.cursor = c;
    }
    @Override
    public void execute() {
        cursor.move(-1,0);
    }
}
