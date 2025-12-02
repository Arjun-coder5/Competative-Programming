import java.util.*;

public class Ques_20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    List<Integer> list1 = new ArrayList<>();
    for(char c: s.toCharArray()){
      if(c!='+'){
        list1.add(c-'0');
      }
      
    }
    Collections.sort(list1);
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i<list1.size();i++){
      sb.append(list1.get(i));
       if(i != list1.size() - 1) {
        sb.append("+");
      }
    }
    System.out.println(sb.toString());
  }
}
