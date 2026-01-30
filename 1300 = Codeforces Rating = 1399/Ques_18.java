import java.util.Scanner;

public class Ques_18{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int i = 1;
    int ans = 0;
    while (true) { 
        if(m>=i){
         m = m-i;
         i++;
         if(i>n){
          i = 1;
         } 
        }else{
          break;
        }
    }
    System.out.println(m);
  }
  }
