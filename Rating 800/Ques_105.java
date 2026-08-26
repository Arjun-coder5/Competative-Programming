import java.util.Scanner;

public class Ques_105 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        for (int n = 1; n <= 10; n++) {

            int total = k * n;
            int lastDigit = total % 10;

            if (lastDigit == 0 || lastDigit == r) {
                System.out.println(n);
                break;
            }
        }
    }
}