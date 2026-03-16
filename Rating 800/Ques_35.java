import java.util.*;

public class Ques_35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();

        while(q-- > 0){

            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = 0;

            for(int i = l-1; i <= r-1; i++){
                sum += s.charAt(i) - 'a' + 1;
            }

            System.out.println(sum);
        }
    }
}