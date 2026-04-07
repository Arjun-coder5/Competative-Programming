
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques_52 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                Set<Integer> hs = new HashSet<>();
                 for(int i = 0;i*i<n;i++){
                  hs.add(i*i);
                 }
                 for (long i = 1; i * i * i <= n; i++) {
                    hs.add((int)(i * i * i));
                }
                 System.out.println(hs.size());

            }
            
          }
  }
}
