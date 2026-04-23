import java.util.*;
public class Ques_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
               // int n = sc.nextInt();
                String s = sc.next();
                String ts = sc.next();
                int[] freq = new int[26];
                for(int i = 0;i<s.length();i++){
                    freq[s.charAt(i)-'a']++;
                }
              if(ts.equals("abc")&&freq['a'-'a']>0&&freq['b'-'a']>0&&freq['c'-'a']>0){
                while(freq['a'-'a']-->0)System.out.print('a');
                while(freq['c'-'a']-->0)System.out.print('c');
                while(freq['b'-'a']-->0)System.out.print('b');
                for(int i = 3;i<26;i++){
                    while(freq[i]-->0){
                        System.out.print((char)(i+'a'));
                    }
                }
              }else{
                char[] arr = s.toCharArray();
                Arrays.sort(arr);
                System.out.print(new String(arr));
              }
              System.out.println();
            }
        }
    }
}