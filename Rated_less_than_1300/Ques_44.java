import java.util.*;

public class Ques_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String first = sc.nextLine();
        int c1 = 1, c2 = 0;
        String second = "";

        for(int i = 1; i < n; i++){
            String s = sc.nextLine();
            if(s.equals(first)) c1++;
            else { second = s; c2++; }
        }

        System.out.println(c1 > c2 ? first : second);
    }
}
