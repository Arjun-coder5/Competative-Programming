import java.util.Scanner;

public class ques_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int even = 0;
            int odd = 0;
            for(int i = 0;i<n;i++) {
                int x = sc.nextInt();
                if(x%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            if(odd%2==0||(even%2==1&&odd%2==1)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
