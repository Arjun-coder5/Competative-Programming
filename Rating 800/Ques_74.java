import java.util.*;
public class Ques_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
          int t = sc.nextInt();
          while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i<n;i++){
              a[i] = sc.nextInt();
            }
            for(int i = 0;i<n-1&&k>0;i++){
              while(a[i]>0&&k>0){
                a[i]--;
                a[n-1]++;
               // n--;
                k--;
              }
            }
            for(int num : a){
              System.out.println(num);
            }
          }
        }
    }
}