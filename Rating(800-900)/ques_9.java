import java.util.Scanner;

public class ques_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int ans = 0;
            for(int i = 0;i<10;i++){
                String s = sc.next();
                for(int j = 0;j<10;j++){
                    if(s.charAt(j)=='X') {
                        int d = Math.min(Math.min(i, j), Math.min(9 - i, 9 - j));

                        ans += d + 1;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
