import java.util.Arrays;
import java.util.Scanner;

public class Ques_89 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    long move = 0;

    for(int i = 0;i<n;i++){
      int result = i+1;
      move += Math.abs(a[i]-result);
    }
    System.out.println(move);
  }
}
