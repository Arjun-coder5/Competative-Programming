import java.util.*;
public class Ques_33{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   if (!sc.hasNextInt()) return;
  int t = sc.nextInt();
  while(t-->0){
  int n = sc.nextInt();
  int k = sc.nextInt();
   int[] a = new int[n];
   int[] b = new int[n];
    for(int i = 0; i < n; i++) a[i] = sc.nextInt();
    for(int i = 0; i < n; i++) b[i] = sc.nextInt();
     int cs = k;
    int[][] merge = new int[n][2];
   for(int i = 0; i < n; i++){
     merge[i][0] = a[i];
     merge[i][1] = b[i];
}
   Arrays.sort(merge, (x, y) -> Integer.compare(x[0], y[0]));
    for(int i = 0; i < n; i++){
        if (cs >= merge[i][0]) {
         cs += merge[i][1];
}else{
  break;
}
}
     System.out.println(cs);

}
}
}