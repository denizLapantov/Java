import java.util.Scanner;

/**
 * Created by deniz on 23.3.2016 г..
 */
public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] str = console.nextLine().split(" ");
        String[] input =console.nextLine().split(" ");
        int digit = Integer.parseInt(input[1]);
        String oddOrEven = input[2];

        int[] numbers = new int[str.length];
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] =Integer.parseInt(str[i]);
        }
        if (oddOrEven.equals("odd")) {
            PrintNumbers(numbers, digit ,1);
        }else {
            PrintNumbers(numbers, digit, 0);
        }
    }

    private static void PrintNumbers(int[] numbers, int digit, int evenOdd) {
        for (int j = 0; j <numbers.length ; j++) {
            if (digit == 0) {
                break;
            }
            if (numbers[j] % 2 == evenOdd){
                digit--;
                System.out.print(numbers[j] + " ");
            }
        }
    }
}
