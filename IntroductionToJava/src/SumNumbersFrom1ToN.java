import javax.security.sasl.SaslServer;
import java.util.Scanner;
/**
     * Created by deniz on 15.3.2016 г..
     */
    public class SumNumbersFrom1ToN {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int j = 1; j <= n ; j++) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
