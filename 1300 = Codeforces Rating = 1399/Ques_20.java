import java.util.Scanner;

public class Ques_20 {
  public static void main(String[] args) {
    Scanner sc = new  Scanner(System.in);
   int n = sc.nextInt();
    int t = sc.nextInt();
    char[] arr = sc.next().toCharArray();
    while(t-->0){
      for(int i = 0;i<n-1;){
        if(arr[i]=='B'&&arr[i+1]=='G'){
          // Swap : 
          arr[i]='G';
          arr[i+1]='B';
          i = i+2;
        }else{
          i++;
        }
      }
    }
    System.out.println(new String(arr));
  }
}
