import java.io.*;
import java.util.*;

public class Ques_71 {
    public static void main(String[] args) throws Exception {

        // STEP 1: Read input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // STEP 2: Create prime array
        int limit = 10_000_000;
        boolean[] prime = new boolean[limit + 1];

        // STEP 3: Assume all are prime
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        // STEP 4: Sieve of Eratosthenes
        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        // STEP 5: Print first n primes
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= limit && count < n; i++) {
            if (prime[i]) {
                sb.append(i).append(" ");
                count++;
            }
        }

        System.out.println(sb.toString().trim());
    }
}
