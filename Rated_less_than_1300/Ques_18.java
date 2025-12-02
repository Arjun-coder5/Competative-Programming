import java.util.Scanner;

public class Ques_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int best = scores[0];
        int worst = scores[0];
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            if (scores[i] > best) {
                amazing++;
                best = scores[i];
            } else if (scores[i] < worst) {
                amazing++;
                worst = scores[i];
            }
        }

        System.out.println(amazing);
    }
}
