import java.util.Scanner;

public class Q_47 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if(!sc.hasNext())return;
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int m = sc.nextInt();
      int r = sc.nextInt()-1;
      int c = sc.nextInt()-1;

      char[][] grid = new char[n][m];
     
     boolean checkBlack = false;
     for(int i = 0;i<n;i++){
      String line = sc.next();
      grid[i] = line.toCharArray();
      if(line.contains("B")){
         checkBlack = true;
      }
     }

     if(!checkBlack){
      System.out.println(-1);
      continue;
     }
      if(grid[r][c] == 'B'){
        System.out.println(0);
        continue;
      }
      boolean rowOrColHasBlack = false;
       for(int i = 0;i<m;i++){
        if(grid[r][i] == 'B'){
          rowOrColHasBlack = true;
          break;
        }
       }

       if(!rowOrColHasBlack){
         for(int i = 0;i<n;i++){
          if(grid[i][c] == 'B'){
            rowOrColHasBlack = true;
            break;
          }
         }
         if(rowOrColHasBlack){
           System.out.println(1);
         } else {
           System.out.println(-1);
         }
       }




    }
  }
}
