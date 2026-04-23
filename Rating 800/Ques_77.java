import java.util.*;
public class Ques_77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
          int t = sc.nextInt();
          while(t-->0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            boolean possible = true;
            for(int i = 0;i<n;i++){
              if(s1.charAt(i)=='1'&&s2.charAt(i)=='1'){
                  possible  = false;
                  break;
              }
            }
            if(possible){
              System.out.println("YES");
            }else{
              System.out.println("NO");
            }
          }
        }
    }
}