import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Cursor {
    private int row = 0;
    private int col = 0;
    private Rectangle[][] grid;

    public Cursor(Rectangle[][] grid){
        this.grid = grid;
        highlight();
    }
    public void move(int dRow, int dCol){
        unhighlight();
        if(row+dRow < 0){
            row = 7;
        }else if(row+dRow > 7){
            row = 0;
        }else if(col+dCol < 0){
            col = 7;
        }else if(col+dCol > 7){
            col = 0;
        }else{
            row += dRow;
            col += dCol;
        }
     //   row =Math.max(0, Math.min(7, row+dRow));
       // col = Math.max(0, Math.min(7, col+dCol));
        highlight();
    }

    public void moveUp(){
        unhighlight();
        if(row != 0){
            row -= 1;
        }else{
            row = 7;
        }
        highlight();
    }
    public void moveDown(){
        unhighlight();
        if(row != 7){
            row += 1;
        }else{
            row = 0;
        }
        highlight();
    }
    public void moveLeft(){
        unhighlight();
        if(col != 0){
            col -= 1;
        }else{
            col = 7;
        }
        highlight();
    }
    public void moveRight(){
        unhighlight();
        if(col != 7){
            col += 1;
        }else{
            col = 0;
        }
        highlight();
    }

    public void highlight(){
        grid[row][col].setStroke(Color.RED);
        grid[row][col].setStrokeWidth(4);
    }
    public void unhighlight(){
        grid[row][col].setStroke(Color.GRAY);
        grid[row][col].setStrokeWidth(1);
    }

    public void toggle(){
        Rectangle cell = grid[row][col];
        if(cell.getFill() == Color.BLACK){
            cell.setFill(Color.WHITE);
        }else{
            cell.setFill(Color.BLACK);
        }
    }

    public int getRow(){
        return  row;
    }

    public int getCol() {
        return col;
    }
}
