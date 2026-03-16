import java.util.*;

public class Ques_37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++){
                int x = Math.abs(sc.nextInt());
                map.put(x, map.getOrDefault(x,0) + 1);
            }

            int ans = 0;

            for(int key : map.keySet()){
                int freq = map.get(key);

                if(key == 0){
                    ans += 1;
                }else{
                    ans += Math.min(freq,2);
                }
            }

            System.out.println(ans);
        }
    }
}