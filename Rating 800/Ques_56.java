import java.util.Scanner;

public class Ques_56{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  if(sc.hasNext()){
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
      long l = -(n-1);
      long r = n;
      System.out.println(l + " " + r);
    }
  }
  }
}