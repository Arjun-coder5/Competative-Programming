import java.util.Scanner;

public class Ques_1{
  public static void main (String[]args){
    //  A. Young Physicist 
      Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int sumX = 0,sumY = 0,sumZ = 0;
     for(int i = 0;i<n;i++){
      sumX += sc.nextInt();
      sumY += sc.nextInt();
      sumZ += sc.nextInt();
     }
     if(sumX ==0 && sumY==0 && sumZ == 0){
      System.out.println("YES");
     }else{
      System.out.println("NO");
     }




  }
}