import java.util.*;

public class Ques_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int k = sc.nextInt();
       int a[] = new int[12];
      for(int i = 0;i<12;i++){
       a[i] = sc.nextInt();
    }
     int sum = 0;
   int count = 0;
      Arrays.sort(a);
    if(k==0){
   System.out.println(0);
   return;
}
      for(int i = 11;i>=0;i--){
    sum += a[i];
    count++;
    if(sum>=k){
         System.out.println(count);
          return;
      }
     }
   System.out.println(-1);
    }
}
