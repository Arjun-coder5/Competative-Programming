import java.util.Scanner;

public class Q_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int count= 0;
                while(n>0){
                    n -= decimal(n);
                    count++;
                }
                System.out.println(count);
            }
        }
    }
    public static int decimal(int n){
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>'0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        
        }
           return Integer.parseInt(sb.toString());
    }
}