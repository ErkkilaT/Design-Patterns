public class MoveCursorDownCommand implements Command{
    private Cursor cursor;
    public MoveCursorDownCommand(Cursor c){
        this.cursor = c;
    }
    @Override
    public void execute() {
        cursor.move(1,0);
    }
}
