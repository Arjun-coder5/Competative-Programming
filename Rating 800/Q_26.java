import java.util.*;

public class Q_26 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            
            String s = sc.next();
            int[] freq = new int[26];
            
            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 2) {
                    sb.append((char)(i + 'a'));
                    sb.append((char)(i + 'a'));
                }
            }
            
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 1) {
                    sb.append((char)(i + 'a'));
                }
            }
            
            System.out.println(sb);
        }
        
        sc.close();
    }
}
