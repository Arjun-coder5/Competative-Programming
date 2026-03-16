import java.util.*;
public class Ques_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();
            long max = Math.max(r,b);
            long min = Math.min(r,b);
            if(max <= min * (d + 1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}