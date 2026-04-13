
import java.util.Scanner;

public class Ques_61{
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    if(sc.hasNext()){
      int t = sc.nextInt();
      while(t-->0){
        long l = sc.nextInt();
        long r = sc.nextInt();
        long max = 0;
        long ans = Math.max(max,l%r);
        System.out.println(ans);
       }
       
    }
  }
}