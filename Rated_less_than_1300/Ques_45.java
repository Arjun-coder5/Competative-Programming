import java.util.*;

public class Ques_45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();

        int maxRatio = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(b[j] % a[i] == 0) {
                    int ratio = b[j] / a[i];
                    if(ratio > maxRatio) {
                        maxRatio = ratio;
                        count = 1;
                    } else if(ratio == maxRatio) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
