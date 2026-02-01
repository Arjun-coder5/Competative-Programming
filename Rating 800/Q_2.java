import java.util.Scanner;

public class Q_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t-->0){
      int n = sc.nextInt();
     int even = 0,odd = 0;
     for(int i = 0;i<2*n;i++){
      int x = sc.nextInt();
      if(x%2==0){
        even++;
      }else{
        odd++;
      }
     }
      if (odd == even)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}
