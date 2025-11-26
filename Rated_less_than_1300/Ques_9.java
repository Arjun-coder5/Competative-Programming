import java.util.Scanner;

public class Ques_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int cnt= 0;
    for(char ch : s.toCharArray()){
      if(ch=='4'||ch=='7'){
        cnt++;
      }
    }
    if(isLuckey(cnt)){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
  public static  boolean isLuckey(int cnt){
    if(cnt==0)return false;
    while(cnt>0){
      int x = cnt%10;
      if(x!=4 && x!=7){
        return false;
      }
      cnt /= 10;
    }
    return true;
  }
}
