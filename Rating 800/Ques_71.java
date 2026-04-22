import java.util.*;
public class Ques_71{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if(sc.hasNext()){
       int t = sc.nextInt();
       while(t-->0){
        long a = sc.nextLong();//programmers
        long b = sc.nextLong();//mathmaticians
        long res  = Math.min(Math.min(a,b),(a+b)/4);
        System.out.println(res);
       }
    }
  }
}