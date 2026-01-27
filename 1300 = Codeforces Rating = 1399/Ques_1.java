import java.util.*;
public class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxPos = arr[0],minPos = arr[0];
        int maxIdx = 0, minIdx = -1;
        for (int i = 1; i < n; i++) {
            if(arr[i]>maxPos){
                maxPos = arr[i];
                maxIdx = i;
            }
        }
        for (int i = 1; i < n; i++) {
            if(arr[i]<minPos){
                minPos = arr[i];
                minIdx = i;
            }
        }
        int swap = maxIdx+(n-1-minIdx);
        if(maxPos<minPos){
            swap--;
        }
        System.out.println(swap);

    }
}