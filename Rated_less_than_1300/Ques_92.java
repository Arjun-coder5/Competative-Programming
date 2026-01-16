import java.util.Scanner;

public class Ques_92 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n+1];
    for(int i = 1;i<=n;i++){
      arr[i] = sc.nextInt();
    }
    int[] dis = new int[n+2];
    int count = 0;
    boolean[] seen = new boolean[100001];
    for(int i = n;i>=1;i--){
      if(!seen[arr[i]]){
        seen[arr[i]]= true;
        count++;
      }
      dis[i] = count;
    }
   StringBuilder sb = new StringBuilder();
   for(int i = 0;i<m;i++){
   int l = sc.nextInt();
   sb.append(dis[l]).append("\n");
   }
   System.out.println(sb.toString());
  }
}