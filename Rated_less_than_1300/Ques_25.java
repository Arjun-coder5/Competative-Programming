import java.util.*;

public class Ques_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;          // total ml
        int totalSlices = c * d;         // total lime slices

        int toastsFromDrink = totalDrink / (n * nl);
        int toastsFromLimes = totalSlices / n;
        int toastsFromSalt = p / (n * np);

        int answer = Math.min(toastsFromDrink, Math.min(toastsFromLimes, toastsFromSalt));

        System.out.println(answer);
    }
}
