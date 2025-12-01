import java.util.Scanner;

public class Ques_15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;
    for(int i = 0;i<n;i++){
      sum += sc.nextDouble(); //read Percentage :
    }
    double result  = sum/n;
    System.out.println(result);
  }
}
