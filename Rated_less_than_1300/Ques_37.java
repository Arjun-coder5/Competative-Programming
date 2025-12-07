import java.util.*;
public class Ques_37{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  long n = sc.nextLong();
  long k = sc.nextLong();

   long oddCount = (n+1)/2;
   
   if(k<=oddCount){
   System.out.println((2*k)-1);
}else if(k>oddCount){
   k = k-oddCount;
   System.out.println(2*k);
}
}
}