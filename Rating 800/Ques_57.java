import java.util.Scanner;

public class Ques_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int upvotes = 0;
                
                for (int i = 0; i < n; i++) {
                    int type = sc.nextInt();
                    if (type == 1 || type == 3) {
                        upvotes++;
                    }
                }
                System.out.println(upvotes);
            }
        }
        sc.close();
    }
}