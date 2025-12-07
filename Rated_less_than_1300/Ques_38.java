import java.util.*;
public class Ques_38{
 public static void main (String[]args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
 long min = Long.MAX_VALUE;
 int count = 0;
 int index = -1;
  for(int i = 1;i<=n;i++){
  long x = sc.nextLong();
  if(x<min){
  min = x;
 count = 1;
 index = i;
  }else if(x==min){
   count++;
 }
 }
 if(count>1){
  System.out.println("Still Rozdil");
}else{
 System.out.println(index);
}
 
  
}
}