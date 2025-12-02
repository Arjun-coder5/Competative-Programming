import java.util.*;

public class Ques_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int current = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            int exit = sc.nextInt();
            int enter = sc.nextInt();

            current -= exit;  // first exit
            current += enter; // then enter

            maxCapacity = Math.max(maxCapacity, current);
        }

        System.out.println(maxCapacity);
    }
}
