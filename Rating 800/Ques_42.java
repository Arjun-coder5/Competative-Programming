import  java.util.*;
public class Ques_42 {
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
   while(t-->0){
   int n = sc.nextInt();
   int[] a = new int[n];
   int[] b = new int[n];
    for(int i = 0;i<a.length;i++){
    a[i] = sc.nextInt();
}
     for(int i = 0;i<b.length;i++){
    b[i] = sc.nextInt();
}
    for(int i = 0;i<n;i++){
     if(a[i]>b[i]){
     int temp = a[i];
     a[i] = b[i];
     b[i] = temp;
  } 
 }
    int maxA = 0, maxB = 0;
    for(int i = 0; i < n; i++){
   maxA = Math.max(maxA,a[i]);
   maxB = Math.max(maxB, b[i]);
}
    System.out.println(maxA*maxB);
}
}
}