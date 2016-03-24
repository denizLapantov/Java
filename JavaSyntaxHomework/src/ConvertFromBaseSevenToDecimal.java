import java.util.Scanner;

/**
 * Created by deniz on 22.3.2016 г..
 */
public class ConvertFromBaseSevenToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
            String num = console.next();
        System.out.println(convertToDecimal(num, 7));
    }

    public static int convertToDecimal(String str, int base) {
        int v = 0;
        int total = 0;
        int pow = 0;
        str = str.toUpperCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9')
                v = c - '0';
            else if (c >= 'A' && c <= 'Z')
                v = 10 + (c - 'A');
            total += v * Math.pow(base, pow);
            pow++;
        }
        return total;
    }
}
