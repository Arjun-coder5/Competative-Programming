import java.util.Scanner;

public class Ques_54{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                String n = sc.next();
             
                if((n.charAt(n.length()-1)-'0')%2==0){
                  System.out.println(1);
                  break;
            }
               if((n.charAt(0)-'0')%2==0){
                   System.out.println(1);
               }
               boolean hasEven = false;
        for (int i = 0; i <n.length(); i++) {
            if ((n.charAt(i) - '0') % 2 == 0) {
                hasEven = true;
                break;
            }
        }
        
        if (hasEven) {
            System.out.println(2);
        } else {
            // Case -1: No even digits present
            System.out.println(-1);
        }
          }
        }
    }
  }