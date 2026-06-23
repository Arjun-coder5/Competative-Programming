
import java.util.Scanner;

public class Ques_1{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      int k = sc.nextInt();
      String s = sc.next();

      int[] countOne = new int[n];
       for(int i = 0;i<s.length();i++){
       if(s.charAt(i)=='1'){
        countOne[i%k]++;
       }
       }
       boolean check = true;
       for(int i = 0;i<k;i++){
        if(countOne[i]%2!=0){
          check = false;
          break;
        }
       }
       if(check){
        System.out.println("YES");
       }else{
        System.out.println("NO");
       }
    }
  }
}