import java.util.*;

public class Ques_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += sc.nextInt();       
        }

        int totalPeople = n + 1;       
        int count = 0;

        for(int dima = 1; dima <= 5; dima++) {
            int total = sum + dima;    
            int pos = total % totalPeople;

           
            if(pos != 1) {
                count++;                
            }
        }

        System.out.println(count);
    }
}
