import java.util.*;

public class Ques_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            totalSum += x;

            if (x % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (totalSum % 2 == 0) {
            System.out.println(evenCount);
        } else {
            System.out.println(oddCount);
        }
    }
}
