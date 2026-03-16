import java.util.*;

public class Ques_38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder ans = new StringBuilder();

            for(int i = 0; i < n; i++){

                char c = s.charAt(i);

                if(c == 'U'){
                    ans.append('D');
                }
                else if(c == 'D'){
                    ans.append('U');
                }
                else{
                    ans.append(c);
                }
            }

            System.out.println(ans.toString());
        }
    }
}