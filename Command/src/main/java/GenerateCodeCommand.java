import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GenerateCodeCommand implements Command{
    private Rectangle[][] grid;
    public GenerateCodeCommand(Rectangle[][] grid){
        this.grid = grid;
    }
    @Override
    public void execute() {
        System.out.println("int[][] pixelArt = {");
        for(int i = 0; i < 8; i++){
            System.out.print("   {");
            for (int j = 0; j < 7; j++){
                System.out.print(getNumberFromColor(grid[i][j]) + ", ");
            }
            System.out.print(getNumberFromColor(grid[i][7]) + "},\n");
        }
        System.out.println("};");
    }

    private int getNumberFromColor(Rectangle cell){
        if(cell.getFill() == Color.BLACK) return 1;
        return 0;
    }
}
