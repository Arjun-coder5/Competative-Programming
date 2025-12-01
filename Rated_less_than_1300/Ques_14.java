import java.util.Scanner;

public class Ques_14{
  public static void main(String[] args) {
    // A. Arrival of the General
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

      
        int maxVal = -1, maxPos = 0;
        for(int i = 0; i < n; i++){
            if(a[i] > maxVal){
                maxVal = a[i];
                maxPos = i;
            }
        }

       
        int minVal = 101, minPos = 0;
        for(int i = 0; i < n; i++){
            if(a[i] <= minVal){
                minVal = a[i];
                minPos = i;
            }
        }

        int moves = 0;
        moves+= maxPos;
        moves += (n-1-minPos);
        if(maxPos>minPos)moves--;
        System.out.println(moves);
  }
}