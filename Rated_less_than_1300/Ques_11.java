import java.util.Scanner;

public class Ques_11{
  public static void main(String[] args) {
      // A. Panoramix's Prediction
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();

      int next = n+1;
     while (true) { 
         boolean isPrime = true;
         for(int i = 2;i*i<=next;i++){
          if(next%i==0){
            isPrime = false;
            break;
          }
         }

         if(isPrime){
       break;
         }
         next++;

        
     }
  if(next==m){
          System.out.println("YES");
         }else{
          System.out.println("NO");
         }
    }
}