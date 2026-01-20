import java.util.*;
public class Ques_97{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int k = sc.nextInt();
   String s = sc.next();
   long[] freq = new long[26];
   for(char c : s.toCharArray()){
      freq[c-'A']++;
}
    Arrays.sort(freq);
    long ans = 0;
   for(int i = 25;i>=0&&k>0;i--){
      if(freq[i]==0) break;
       long take = Math.min(freq[i],k);
        ans += take*take;
        k -= take;
}
    System.out.println(ans);
}
}