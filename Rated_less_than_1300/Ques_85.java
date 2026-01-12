import java.util.*;
public class Ques_85{
public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int c25 = 0;
  int c50 = 0;
  for(int i  = 0 ;i<n;i++){
   int bill = sc.nextInt();
   if(bill==25){
// System.out.println("NO");
   c25++;
}else if(bill==50){
   if(c25==0){
   System.out.println("NO");
   return;
}
  c25--;
  c50++;
}else{
  if(c25>0&&c50>0){
   c25--;
   c50--;
}else if(c25>=3){
  c25-=3;
}else{
  System.out.println("NO");
   return;
}
}
  

}
System.out.println("YES");
}
}