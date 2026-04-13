import java.util.*;
public class Ques_60{
  public static void main(String[]args){
    // A. Regular Bracket Sequences :  
  //   T =  3
   //  n =  3
  //   n =  1
   //  n =  3
  //  n = 3: 
  // Naive way to do it  : 
  Scanner sc = new Scanner(System.in);
  if(sc.hasNext()){
    int t = sc.nextInt();
    
    while(t-->0){
      int n = sc.nextInt();
  //      backtrack(n,0,0,"");
  //   }
  //  }
  // }
  // public static void backtrack(int n, int start, int end, String curr){
  //   if(curr.length()==2*n){
  //     System.out.println(curr);
  //     return;
  //   }
  //   if(start<n){
  //     backtrack(n, start+1, end, curr+"(");
  //   }
  //   if(end<start){
  //     backtrack(n, start, end+1, curr+")");
  //   }
  // Effecient way : 
    for (int i = 0; i < n; i++) {

                StringBuilder sb = new StringBuilder();

              
                for (int j = 0; j < i; j++) {
                    sb.append("()");
                }

                
                for (int j = 0; j < (n - i); j++) {
                    sb.append("(");
                }

                
                for (int j = 0; j < (n - i); j++) {
                   sb.append(")");
                }

                System.out.println(sb.toString());
            }   
}
}
  }
}