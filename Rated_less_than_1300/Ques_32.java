import java.util.*;
public class Ques_32{
 public static void main (String[]args){
   Scanner sc = new Scanner(System.in);
  int n= sc.nextInt();
  int m = sc.nextInt();
  int[] a =new int[n];
  for(int i = 0;i<n;i++){
  a[i] = sc.nextInt();
  }
  int LCI = 1;
 int maxTurn = 0;
  for(int i = 0;i<n;i++){
  int turns = (a[i]+m-1)/m;
  if(turns>=maxTurn){
  maxTurn = turns;
  LCI = i+1;
  }
  } 
System.out.println(LCI);
 }
}