import java.util.*;
public class Ques_67{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
if(sc.hasNext()){
  int t = sc.nextInt();
  while(t-->0){
     int n = sc.nextInt();
     int d = sc.nextInt();
     int[] a = new int[n];
   boolean condn = true;
     for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      if(a[i]>d){
       condn = false;
}
}
   Arrays.sort(a);
    if(condn||(n>1 && a[0]+a[1]<=d)){
        System.out.println("YES");
}else{
    System.out.println("NO");
}
}
}
}
}