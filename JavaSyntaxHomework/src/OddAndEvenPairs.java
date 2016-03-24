import com.sun.xml.internal.ws.api.message.Message;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by deniz on 22.3.2016 г..
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input  = console.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <input.length ; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        if (numbers.size() % 2 != 0) {
            System.out.println("Invalid Lenght");
            System.exit(0);
        }
        for (int i = 0; i <numbers.size() ; i +=2) {
            if (numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0) {
                System.out.println(MessageFormat.format("{0}, {1} -> both are even", numbers.get(i),numbers.get(i + 1)));
            }
            else if (numbers.get(i) % 2 != 0 && numbers.get(i + 1) % 2 != 0) {
                System.out.println(MessageFormat.format("{0}, {1} -> both are odd", numbers.get(i),numbers.get(i + 1)));
            }
            else {
                System.out.println(MessageFormat.format("{0}, {1} -> different", numbers.get(i),numbers.get(i + 1)));
            }
        }
    }
}
