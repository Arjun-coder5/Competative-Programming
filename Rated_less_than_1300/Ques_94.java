import java.util.Scanner;

public class Ques_94 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int prev = -1;
    int n = sc.nextInt();
    int count = 0;
    int ans = 0;
    for(int i = 0;i<n;i++){
       int h = sc.nextInt();
       int m = sc.nextInt();
       int t = h*60+m;
       if(prev==t){
        count++;
       }else{
        ans = Math.max(ans,count);
        count = 1;
        prev = t;
       }
    }
    ans =Math.max(ans, count);
    System.out.println(ans);
  }
}
