import java.util.*;
public class Ques_73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
          int t = sc.nextInt();
          while(t-->0){
            int n = sc.nextInt();
            String[] s = new String[n-2];
             for (int i = 0; i < n - 2; i++) {
                s[i] = sc.next();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(s[0]);
            for(int i = 1;i<n-2;i++){
              if(s[i-1].charAt(1)!=s[i].charAt(0)){
                   sb.append(s[i - 1].charAt(1));
              }
                    sb.append(s[i].charAt(1));  
              }
                System.out.println(sb.toString());
            }
          
          }
        }
    }