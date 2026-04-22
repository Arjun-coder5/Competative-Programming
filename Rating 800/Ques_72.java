import java.util.*;
public class Ques_72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
               int n = sc.nextInt();
               int[] b = new int[n];
               for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
               }
               int left = 0;
               int right = n-1;
              StringBuilder sb = new StringBuilder();
              while(left<right){
                if(b[left]==b[right]){
                     sb.append(b[left]).append(" ");
                }else{
                    sb.append(b[left]).append(" ");
                    sb.append(b[right]).append(" ");
                }
                left++;
                right--;
            }
            System.out.println(sb.toString().trim());
            }
            sc.close();
        }
    }
}
