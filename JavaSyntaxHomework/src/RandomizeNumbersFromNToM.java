import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by deniz on 22.3.2016 г..
 */
public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int m = console.nextInt();
        int biggerNumber = 0;
        int smallerNumber = 0;

        if (n > m) {
            smallerNumber = m;
            biggerNumber = n;
        }
        else if (n < m) {
            smallerNumber = n;
            biggerNumber = m;
        }

        List<Integer> list = new ArrayList<Integer>();

        for (int i = smallerNumber; i <= biggerNumber ; i++) {
            list.add(i);
            Collections.shuffle(list);
        }
        for (int item: list){
            System.out.print(item + " ");
        }
    }
}
