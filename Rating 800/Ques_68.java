import java.util.Scanner;

public class Ques_68 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if(sc.hasNext()){
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            
            int sumA = 0, sumB = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sumA += a[i];
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                sumB += b[i];
            }
            if (sumA != sumB) {
                System.out.println("-1");
                continue;
            }
            
      }
    }
  }
}
