import java.io.*;
import java.util.*;

public class Ques_83 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        int n = Integer.parseInt(br.readLine().trim());
        String[] parts = br.readLine().trim().split(" ");
        int total = 2 * n;

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < total; i++) {
            int val = Integer.parseInt(parts[i]);
            map.putIfAbsent(val, new ArrayList<>());
            map.get(val).add(i + 1); // index is 1-based
        }

        for (int key : map.keySet()) {
            if (map.get(key).size() % 2 != 0) {
                out.println("-1");
                out.close();
                return;
            }
        }

        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int i = 0; i < list.size(); i += 2) {
                out.println(list.get(i) + " " + list.get(i + 1));
            }
        }

        out.close();
    }
}
