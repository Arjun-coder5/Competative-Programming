import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int need = n - 10; // queen gives 10
        int ans = 0;

        if (need <= 0) {
            ans = 0;
        } 
        else if (need >= 2 && need <= 9) {
            ans = 4;
        } 
        else if (need == 1 || need == 11) {
            ans = 4;
        } 
        else if (need == 10) {
            ans = 15;
        } 
        else {
            ans = 0;
        }

        System.out.println(ans);
    }
}
