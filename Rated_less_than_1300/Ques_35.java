import java.util.*;
public class Ques_35{
 public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
  
   int x = (int)Math.sqrt((a*c)/b);
   int y = a/x;
   int z = c/x;

  int sumOfDigit = 4*(x+y+z);
  System.out.println(sumOfDigit);
 }
}
