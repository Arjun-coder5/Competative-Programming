import java.util.*;

public class Ques_34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            String kb = sc.next(); 
            String s = sc.next();    
            int[] pos = new int[26];
            for (int i = 0; i < kb.length(); i++) {
                pos[kb.charAt(i) - 'a'] = i;
            }
            int time = 0;
            for (int i = 1; i < s.length(); i++) {
                int prev = pos[s.charAt(i - 1) - 'a'];
                int curr = pos[s.charAt(i) - 'a'];

                time += Math.abs(curr - prev);
            }

            System.out.println(time);
        }

        sc.close();
    }
}