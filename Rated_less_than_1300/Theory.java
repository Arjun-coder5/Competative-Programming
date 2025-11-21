public class Theory{
  public static void main(String[] args) {
//     🎯 Basic Theory Required for <1300 CF Problems

// (Only what is actually used — nothing extra)

// 🧠 1. Math Basics (Used Very Frequently)
// ➤ Divisibility & Remainders

// A number is divisible by k if num % k == 0

// Even → num % 2 == 0

// Odd → num % 2 == 1

// ➤ GCD & LCM (Very Common)
// int gcd(int a, int b){
//     while(b != 0){
//         int temp = b;
//         b = a % b;
//         a = temp;
//     }
//     return a;
// }


// LCM formula:
// 👉 LCM(a, b) = (a * b) / GCD(a, b)

// ➤ Sum of N numbers

// Sum of first N natural number → n*(n+1)/2

// Sum of arithmetic sequence → (n/2) * (first + last)

// ➤ Counting Digits
// while(n > 0){
//     count++;
//     n /= 10;
// }

// 📊 2. Arrays Theory
// ➤ Frequency Array (Most Used Trick)

// Count occurrences of numbers:

// int[] freq = new int[101];
// for(int x : arr) freq[x]++;

// ➤ Prefix Sum (Basic Level)

// To get sum of subarray l to r:

// prefix[i] = prefix[i-1] + arr[i];
// sum = prefix[r] - prefix[l-1];

// ➤ Max / Min / Index Logic
// int max = arr[0];
// for(int x : arr)
//     if(x > max) max = x;

// 🔤 3. String Theory
// ➤ Counting Characters
// int[] freq = new int[26];
// for(char c : s.toCharArray())
//     freq[c - 'a']++;

// ➤ Reversing / Palindrome check
// int i = 0, j = s.length()-1;
// while(i < j){
//     if(s.charAt(i) != s.charAt(j)) return false;
//     i++; j--;
// }
// return true;

// ➤ Building strings (Important)
// StringBuilder sb = new StringBuilder();
// sb.append('a');
// sb.append("hello");
// String s = sb.toString();

// 🧮 4. Greedy Basic Theory

// Make the best possible choice at every step.

// Examples:

// Problem	Greedy Logic
// Minimum coins	Always take biggest coins first
// Maximize sum	Always use largest values
// Choose minimum cost	Pick smallest value first

// Sort → Choose → Work

// Arrays.sort(arr);

// 🔍 5. Brute Force Theory (Very Important)

// Try all possible cases when N is small (≤1000)

// Example: Check pairs:

// for(int i = 0; i < n; i++){
//     for(int j = i+1; j < n; j++){
//         // check pair arr[i], arr[j]
//     }
// }

// 🧠 6. Logical Thinking (Directly Used in CF)

// Learn to think in terms of:

// Keyword	Meaning
// Minimum / Maximum	Sorting, simple comparison
// At least k operations	Counting
// Can we form?	Checking possibilities
// Good / Bad string	Character frequency
// 👨‍🔧 7. Implementation Skills (MOST IMPORTANT)
// ➤ Read carefully

// Find all constraints

// Find input format

// Check corner cases (0, 1, same numbers)

// ➤ Use fast input-output
// Scanner sc = new Scanner(System.in);

  }
}