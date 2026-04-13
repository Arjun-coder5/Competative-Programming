import java.util.*;
public class Ques_59 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if(sc.hasNext()){
       int t = sc.nextInt();
       while(t-->0){
        int n = sc.nextInt();
        int[] odd = new int[n];
        int[] even = new int[n];

        int height = sc.nextInt();
        for(int i =0;i<n;i++){
        if(height%2==0){
          even[i] = height;
        }else{
          odd[i] = height;
        }
       }
       StringBuilder sb = new StringBuilder();
       for(int x : even){
          sb.append(String.valueOf(x));
       }
       for(int y : odd){
        sb.append(String.valueOf(y));
       }
       System.out.println(sb.toString());
    }
  }
  }
}
