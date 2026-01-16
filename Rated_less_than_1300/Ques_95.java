import java.util.Arrays;
import java.util.Scanner;

public class Ques_95 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int d = sc.nextInt();
    int size = n*m;
    int[] arr = new int[size];
    for(int i = 0;i<size;i++){
     arr[i] = sc.nextInt();
    }
    int rem = arr[0]%d;
    for(int i = 0;i<size;i++){
      if(arr[i]%d!=rem){
        System.out.println(-1);
        return;
      }
    }
    long ans = 0;
    Arrays.sort(arr);
    int median = arr[size/2];
    for(int x : arr){
      ans += Math.abs(x-median)/d;
    }
   System.out.println(ans);
  }
}
