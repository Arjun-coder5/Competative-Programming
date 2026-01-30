public class Main{
 public static void main(String[]args){
  String s = "abcd";
  String curr = "";
  sub(s,0,curr);
 }
 public static void sub(String s,int idx,String curr){
  if(idx==s.length()){
    System.out.println(curr);
    return;
  }
  sub(s, idx+1, curr+s.charAt(idx));
  sub(s, idx+1, curr);

 }

}