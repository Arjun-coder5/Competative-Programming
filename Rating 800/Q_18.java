import java.util.*;

public class Q_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
            }

            int countMin = 0;
            for(int x : arr){
                if(x == min) countMin++;
            }

            System.out.println(n - countMin);
        }
    }
}
