import java.util.*;
public class Ques_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
          int t = sc.nextInt();
          while(t-->0){
            long n = sc.nextLong();
            long s = sc.nextLong();
            long medianPos = n-(n+1)/2+1;
            long median = s/medianPos;
            System.out.println(median);
          }
        }
    }
}