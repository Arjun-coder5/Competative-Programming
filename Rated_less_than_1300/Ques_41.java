import java.util.*;

public class Ques_41{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int m = sc.nextInt();

        long current = 1;
        long time = 0;

        for(int i = 0; i < m; i++){
            long target = sc.nextLong();

            if(target >= current){
                time += target - current;
            } else {
                time += (n - current) + target;
            }

            current = target;
        }

        System.out.println(time);
    }
}
