import java.util.*;

public class Q_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();
            int n = s.length();

            int pos = s.indexOf('a');

            if(pos == -1){
                System.out.println("NO");
                continue;
            }

            int left = pos;
            int right = pos;
            boolean ok = true;

            for(char ch = 'b'; ch < 'a' + n; ch++){
                if(left > 0 && s.charAt(left - 1) == ch){
                    left--;
                }
                else if(right < n - 1 && s.charAt(right + 1) == ch){
                    right++;
                }
                else{
                    ok = false;
                    break;
                }
            }

            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
