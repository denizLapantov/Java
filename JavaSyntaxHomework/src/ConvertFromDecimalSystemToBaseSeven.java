import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by deniz on 22.3.2016 г..
 */
public class ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num =console.nextInt();
        System.out.println(base10Converter(num, 7));
    }

    public static char[]  base10Converter(int number, int finalBase) {
        int quo;
        int rem;
        char[] res = new char[1];

        do {
            rem = number % finalBase;
            quo = number / finalBase;
            res = Arrays.copyOf(res, res.length + 1);
            if (rem < 10) {
                //Converting ints using ASCII values
                rem += 48;
                res[res.length - 1] = (char) rem;
            } else {
                //Convert int > 9 to A, B, C..
                rem += 55;
                res[res.length - 1] = (char) rem;
            }
            number /= finalBase;
        } while (quo != 0);

        //Reverse array
        char[] temp = new char[res.length];
        for (int i = res.length - 1, j = 0; i > 0; i--) {
            temp[j++] = res[i];
        }

        return temp;
    }
}
