
import java.util.*;

public class Ques_81 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();

    while(t-- > 0){

    int n = sc.nextInt();

    char[][] arr = new char[n][n];
    int r1 = -1,r2=-1,c1=-1,c2=-1;
     for(int i = 0; i < n; i++){
     String given = sc.next();
                for(int j = 0; j < n; j++){
                    arr[i][j] = given.charAt(j);
                    if(arr[i][j]=='*'){
                      if(r1==-1){
                      r1 = i;
                      c1 = j;
                      }
                    else{
                      r2 = i;
                      c2 = j;
        }
      }
    }
  }

        if(r1==r2){
          int newRow = (r1+1<n)?r1+1:r1-1;
          arr[newRow][c1] = '*';
          arr[newRow][c2] = '*';
        }else if(c1==c2){
          int newCol = (c1+1<n)?c1+1:c1-1;
          arr[r1][newCol] = '*';
          arr[r2][newCol] = '*';
        }else{
          arr[r1][c2] = '*';
          arr[r2][c1] = '*';
        
    }
    StringBuilder sb = new StringBuilder();
         for(int  i = 0;i<n;i++){
          sb.append(arr[i]).append("\n");
         }
         System.out.println(sb.toString());
  }
  sc.close();
 }
}
