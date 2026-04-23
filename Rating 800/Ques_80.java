import java.util.*;
import java.io.*;

public class Ques_80 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] grid = new char[n][n];
            int[][] pos = new int[2][2];
            int found = 0;

            for (int i = 0; i < n; i++) {
                String row = sc.next();
                grid[i] = row.toCharArray();
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '*') {
                        pos[found][0] = i;
                        pos[found][1] = j;
                        found++;
                    }
                }
            }

            int r1 = pos[0][0], c1 = pos[0][1];
            int r2 = pos[1][0], c2 = pos[1][1];

            if (r1 == r2) {
                // Same row: move to a different row
                int newR = (r1 + 1 < n) ? r1 + 1 : r1 - 1;
                grid[newR][c1] = '*';
                grid[newR][c2] = '*';
            } else if (c1 == c2) {
                // Same column: move to a different column
                int newC = (c1 + 1 < n) ? c1 + 1 : c1 - 1;
                grid[r1][newC] = '*';
                grid[r2][newC] = '*';
            } else {
                // Different row and column: diagonal corners
                grid[r1][c2] = '*';
                grid[r2][c1] = '*';
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(new String(grid[i])).append("\n");
            }
            System.out.print(sb);
        }
    }
}