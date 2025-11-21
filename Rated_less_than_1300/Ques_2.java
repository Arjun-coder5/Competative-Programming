import java.util.Scanner;

public class Ques_2 {
  public static void main(String[] args) {
    //A. Beautiful Matrix
    // Constraints :
    // time limit per test2 seconds
    // memory limit per test256 megabytes
    //  Given - 1 . 5 × 5 matrix(consisting of 24 zeroes and a single number one)
    //          2 .  You can move up, down, left, or right one step at a time.
    // Task - find no of move to get the no at centre .
    //  Way 1 - Manhattan Distance formula use - 
    //  code - 

    Scanner sc = new Scanner(System.in);
    int moves = 0;
    int r1 = 0,c1 = 0;
    for(int i = 1;i<=5;i++){
      for(int j = 1;j<=5;j++){
        int value = sc.nextInt();
        if(value==1){
          r1 = i;
          c1 = j;
        }
      }
    }
    moves = Math.abs(r1-3)+Math.abs(c1-3);
    System.out.println(moves);

  }
}
