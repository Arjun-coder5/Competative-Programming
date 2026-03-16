import java.util.*;
public class Ques_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if (k > (n + 1) / 2) {
                System.out.println(-1);
                continue;
            }
            char[][] chessBoard = new char[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(chessBoard[i], '.');
            }
            int placed = 0;
            for (int i = 0; i < n && placed < k; i += 2) {
                chessBoard[i][i] = 'R';
                placed++;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(chessBoard[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
