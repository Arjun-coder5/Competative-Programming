import java.util.*;
public class Ques_100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        
        for(int i = 0;i<n;i++){
            if(a[i]>h){
              sum += 2;
            }else{
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}