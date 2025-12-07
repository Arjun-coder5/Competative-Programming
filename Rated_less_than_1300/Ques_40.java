import java.util.*;
public class Ques_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int zeroCount = 0;
        int fiveCount = 0;

      
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) zeroCount++;
            else fiveCount++;
        }
        if (zeroCount == 0) {
            System.out.println(-1);
            return;
        }
        if (fiveCount < 9) {
            System.out.println(0);
            return;
        }
        fiveCount = (fiveCount / 9) * 9;
        StringBuilder sb = new StringBuilder();

       
        for (int i = 0; i < fiveCount; i++) {
            sb.append('5');
        }
        for (int i = 0; i < zeroCount; i++) {
            sb.append('0');
        }

        System.out.println(sb.toString());
    }
}
