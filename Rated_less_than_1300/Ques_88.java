import java.util.Scanner;

public class Ques_88 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] g = new char[4][4];
    for(int i = 0;i<4;i++){
      g[i] = sc.next().toCharArray();
    }
    for(int i = 0;i<3;i++){
      for(int j = 0;j<3;j++){
        int black = 0;
        if(g[i][j]=='#')black++;
        if(g[i+1][j]=='#')black++;
        if(g[i][j+1]=='#')black++;
       if(g[i+1][j+1]=='#')black++;

        if(black!=2){
          System.out.println("YES");
          return;
        }
      }
    }
    System.out.println("NO");
  }
}
