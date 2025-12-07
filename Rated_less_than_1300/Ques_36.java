import java.util.*;
public class Ques_36{
 public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
 int[] a = new int[n];
  for(int i = 0;i<n;i++){
  a[i] = sc.nextInt();
  }
  int minDiff = Integer.MAX_VALUE;
  int ans1 = 1,ans2 = 2;
 for(int i = 0;i<n-1;i++){
   int diff = Math.abs(a[i]-a[i+1]);
   if(diff<minDiff){
     minDiff = diff;
    ans1 = i+1;
    ans2 = i+2;
   }
  }
   int CircularDiff = Math.abs(a[n-1]-a[0]);
   if(CircularDiff<minDiff){
     ans1 = n;
     ans2 = 1;
  }
   System.out.println(ans1+" "+ans2);
 }
}