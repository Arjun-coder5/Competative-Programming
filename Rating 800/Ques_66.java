import java.util.Scanner;

public class Ques_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            
           
            int nCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'N') {
                    nCount++;
                }
            }
            
          
            if (nCount == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}