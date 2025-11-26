import java.util.Scanner;

public class Ques_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[3][3];
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        arr[i][j] = sc.nextInt();
      }
    }
    int[][]dir = {{0,0},{-1,0},{1,0},{0,-1},{0,1}};
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        int toggle = 0;
        for(int[] d:dir){
          int x = i+d[0];
          int y = j+d[1];
          if(x>=0&&x<3&&y>=0&&y<3){
            toggle += arr[x][y];
          }
        }
        if(toggle%2==0)System.out.print(1);
        else System.out.print(0);
      }
      System.out.println();
    }
  }
}
