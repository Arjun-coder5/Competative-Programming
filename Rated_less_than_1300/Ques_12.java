import java.util.Scanner;

public class Ques_12 {
  public static void main(String[] args) {
    // Main Line - The i-th digit of the answer is 1 if and only if the i-th digit of the two given numbers differ. In the other case the i-th digit of the answer is 0.
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    String b = sc.nextLine();
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<a.length();i++){
      if(a.charAt(i)!=b.charAt(i)){
         sb.append("1");
      }else{
        sb.append("0");
      }
    }
    System.out.println(sb.toString());
  }
}
