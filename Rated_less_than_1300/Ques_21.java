import java.util.*;

public class Ques_21 {
  public static void main(String[] args) {
    // A. Is your horseshoe on the other hoof?
    Scanner sc = new Scanner(System.in);
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();
    int s4 = sc.nextInt();

    HashSet<Integer> set = new HashSet(4);
    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);

    int distinct = set.size();
    int ans  = 4-distinct;
    System.out.println(ans);
  }
}
