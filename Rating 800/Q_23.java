import java.util.*;

public class Q_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();

            int max = 0;
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                max = Math.max(max, x);
                min = Math.min(min, x);
            }

            System.out.println(max - min);
        }
    }
}
