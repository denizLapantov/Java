import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by deniz on 20.3.2016 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        int result = firstNum * secondNum;
        System.out.println(result);
    }
}
