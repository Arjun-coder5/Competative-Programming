import java.util.*;

public class Ques_13 {
  public static void main(String[] args) {
    // A. Perfect Permutation
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // Odd wala :
    if(n%2==1){
      System.out.print(-1);
      return;
    }
    // Even Wala :
    for(int i = 1;i<=n;i+=2){
      System.out.print((i+1)+" "+i+" ");
    }


  }
}
