import java.util.Scanner;

public class Ques_3
 {
  public static void main(String[] args) {
    // constraints :

    // time limit per test2 seconds
    // memory limit per test256 megabytes
  Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int t = sc.nextInt();
    String s = sc.next();

    char[] queue = s.toCharArray();
    for(int time = 0;time<t;time++){
      for(int i = 0;i<n-1;i++){
        if(queue[i]=='B'&& queue[i+1]=='G'){
          char temp = queue[i];
          queue[i] = queue[i+1];
          queue[i+1] = temp;
          i++;
        }
      }
    }
    System.out.println(new String(queue));
  }
}
