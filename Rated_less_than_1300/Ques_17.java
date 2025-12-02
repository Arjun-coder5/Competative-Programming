import java.util.Scanner;

public class Ques_17 {
public static void main(String[] args) {
  // A. Cupboards
  Scanner sc = new Scanner(System.in);
  int leftOpen = 0,rightopen = 0;
  int n = sc.nextInt();
  for(int i = 0;i<n;i++){
    int l = sc.nextInt();
    int r = sc.nextInt();
    if(l==1)leftOpen++;
    if(r==1)rightopen++;

  }
  int leftEnd = n-leftOpen;
  int rightEnd = n-rightopen;

  int result = Math.min(leftOpen,leftEnd)+Math.min(rightopen,rightEnd);
  System.out.println(result);
}
}
