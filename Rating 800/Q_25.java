import java.util.*;

public class Q_25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            char[] enemy = sc.next().toCharArray();
            char[] gregor = sc.next().toCharArray();

            int ans = 0;

            for(int i = 0; i < n; i++){
                if(gregor[i] == '1'){

                    // Try kill left
                    if(i > 0 && enemy[i-1] == '1'){
                        ans++;
                        enemy[i-1] = '0';
                    }

                    // Try go straight
                    else if(enemy[i] == '0'){
                        ans++;
                    }

                    // Try kill right
                    else if(i < n-1 && enemy[i+1] == '1'){
                        ans++;
                        enemy[i+1] = '0';
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
