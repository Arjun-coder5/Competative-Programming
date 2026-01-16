import java.util.Scanner;

public class Ques_91 {
  static boolean isPrime(int n){
    if(n<2)return false;
    for (int i = 2; i*i< n; i++) {
      if (n%i==0) {
         return false; 
      }
    }
    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
     for(int i = 0;i<n;i++){
     int x =  arr[i];
     int r = (int)Math.sqrt(x);
      if(r*r==x){
        if(isPrime(r)){
          System.out.println("YES");
        }else{
          System.out.println("NO");
        }
     }else{
      System.out.println("NO");
     }
    }
    
  }
}
