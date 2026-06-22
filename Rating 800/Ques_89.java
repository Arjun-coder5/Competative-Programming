
import java.util.*;

public class Ques_89 {

    static boolean canPlace(char[][] grid, int i, int j) {
        int h = grid.length;
        int w = grid[0].length;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nx = i + dx;
                int ny = j + dy;
                if (nx >= 0 && nx < h && ny >= 0 && ny < w) {
                    if (grid[nx][ny] == '1') {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            char[][] grid = new char[h][w];
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    grid[i][j] = '0';
                }
            }
            // Corner - 1 : 
            grid[0][0] = '1';
            grid[0][w - 1] = '1';
            grid[h - 1][0] = '1';
            grid[h - 1][w - 1] = '1';

            //  top row fill kro : 
            for(int i = 1;i<w-1;i++){
              if(canPlace(grid,0,i)){
                grid[0][i] = '1';
              }
            }
            // Bottom row :
            for(int j = 1;j<w-1;j++){
              if(canPlace(grid, h-1, j)){
                grid[h-1][j] = '1';
              }
            }
            // left colm : 

            for(int i = 1; i < h - 1; i++){
    if(canPlace(grid, i, 0)){
        grid[i][0] = '1';
    }
}
          // right colm : 
for(int i = 1; i < h - 1; i++){
    if(canPlace(grid, i, w - 1)){
        grid[i][w - 1] = '1';
    }
}
  for(int i = 0; i < h; i++){
    System.out.println(new String(grid[i]));
}
System.out.println();
        }
    }
}
