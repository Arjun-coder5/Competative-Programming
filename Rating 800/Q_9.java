import java.util.Scanner;

public class Q_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int minIdx = -1;
    int maxIdx = -1;
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0;i<n;i++){
      if(arr[i]<min){
        min = arr[i];
        minIdx = i;
      }
      if(arr[i]>max){
        max = arr[i];
        maxIdx = i;
      }
    }
    int move = 0;
    int pos1 = Math.min(min,max);
    int pos2 = Math.max(min,max);

    int left = pos2+1;
    int right = n-pos1;
    int both = pos2+1+pos1;
     move = Math.min(left, Math.min(right, both));
     System.out.println(move);
  }
}
