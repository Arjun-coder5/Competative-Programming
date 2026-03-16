import java.util.*;

public class Ques_39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            String s = sc.next();

            boolean found = false;

            for(int i = 0; i < n-1; i++){
                if(s.charAt(i) != s.charAt(i+1)){
                    System.out.println((i+1) + " " + (i+2));
                    found = true;
                    break;
                }
            }

            if(!found){
                System.out.println("-1 -1");
            }
        }
    }
}