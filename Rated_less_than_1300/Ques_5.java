import java.util.*;

public class Ques_5 {
  public static void main(String[] args) {
    // Beautifull year :
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(true){
      n++;
      if(allDistinct(n)){
        System.out.println(n);
        break;
      }

    }
  }
  public  static boolean allDistinct(int n){
    String s = n + "";
    Set<Character> set = new HashSet<>();
    for(char c:s.toCharArray()){
      if(set.contains(c))return false;
      set.add(c);

    }
     return true;
  }
}
