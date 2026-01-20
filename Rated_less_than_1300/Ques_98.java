import java.util.*;
public class Ques_98{
 public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
       
    int[] b = a.clone();
    Arrays.sort(b);

        int r = -1, l = -1;
      for(int i = 0;i<n;i++){
            if(a[i]!=b[i]){
              if(l==-1)l = i;
               r = i;
}    
}
        if (l == -1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

   int i = l;
   int j = r;
   while(i<j){
   int temp = a[i];
    a[i] = a[j];
   a[j] = temp;
   i++;
   j--;
}
   for(int k = 0;k<n;k++){
     if(a[k]!=b[k]){
     System.out.println("no");
}
}
    System.out.println("yes");
    System.out.println((l+1)+" "+(r+1));
} 
}