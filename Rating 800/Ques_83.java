import java.util.Scanner;

public class Ques_83 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int n = s.length();

            char[] ch = s.toCharArray();

            for (int i = 0; i < n; i++) {

                // Alice turn
                if (i % 2 == 0) {

                    if (ch[i] == 'a') {
                        ch[i] = 'b';
                    } else {
                        ch[i] = 'a';
                    }
                }

                // Bob turn
                else {

                    if (ch[i] == 'z') {
                        ch[i] = 'y';
                    } else {
                        ch[i] = 'z';
                    }
                }
            }

            System.out.println(new String(ch));
        }
    }
}