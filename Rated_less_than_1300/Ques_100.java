import java.util.*;

public class Ques_100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        StringBuilder res = new StringBuilder();
        res.append(a);

        int cur = a % b;

        for(int i = 0; i < n; i++){
            boolean found = false;
            for(int d = 0; d <= 9; d++){
                if((cur * 10 + d) % b == 0){
                    res.append(d);
                    cur = 0;
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("-1");
                return;
            }
        }

        System.out.println(res.toString());
    }
}
