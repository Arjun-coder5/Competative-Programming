import java.util.*;

public class Ques_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String row = sc.next();
            StringBuilder ans = new StringBuilder();

            for (int j = 0; j < m; j++) {
                char c = row.charAt(j);

                if (c == '-') {
                    ans.append('-');
                } else {
                    if ((i + j) % 2 == 0)
                        ans.append('B');
                    else
                        ans.append('W');
                }
            }
            System.out.println(ans.toString());
        }
    }
}
