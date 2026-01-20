import java.util.*;

public class Ques_99 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        int cannot = 0;

        for(int i=0;i<n;i++){
            boolean canOpen = false;
            for(int j=0;j<n;j++){
                if(i != j && b[j] == a[i]){
                    canOpen = true;
                    break;
                }
            }
            if(!canOpen) cannot++;
        }

        System.out.println(cannot);
    }
}
