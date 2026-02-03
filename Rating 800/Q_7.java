
import java.util.Arrays;
import java.util.Scanner;

public class Q_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long[] a = new long[n];
      for(int i=0;i<n;i++) a[i] = sc.nextLong();
       Arrays.sort(a);

            long sum = 0;
            for(int i=0;i<n-1;i++){
                sum += a[i];
            }

            double avg = (double)sum/(n-1);
            double result = avg + a[n-1];
            System.out.println(result);
    }
  }
}
