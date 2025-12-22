import java.util.*;
public class Ques_56{
 public static void main(String[]args){
 Scanner sc  = new Scanner(System.in);
 int s = sc.nextInt();
 int n = sc.nextInt();
 int d[][] = new int[n][2];
 for(int i = 0;i<n;i++){
 d[i][0] = sc.nextInt();//strength
 d[i][1] = sc.nextInt();//bonus
}
    Arrays.sort(d, (a, b) -> a[0] - b[0]);
 for(int i = 0;i<n;i++){
 if(s<=d[i][0]){
   System.out.print("NO");
   return;
}
  s+= d[i][1];
}
  System.out.println("YES");
  
}
}