package com.company;

import java.util.Scanner;

/**
 * Created by deniz on 16.3.2016 г..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String number = String.valueOf(num);

        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);

            int currentNum = j;
            if (currentNum == 0) {
                sb.append("Gee");
            }
            if (currentNum == 1) {
                sb.append("Bro");
            }
            if (currentNum == 2) {
                sb.append("Zuz");
            }
            if (currentNum == 3) {
                sb.append("Ma");
            }
            if (currentNum == 4) {
                sb.append("Duh");
            }
            if (currentNum == 5) {
                sb.append("Yo");
            }
            if (currentNum == 6) {
                sb.append("Dis");
            }
            if (currentNum == 7) {
                sb.append("Hood");
            }
            if (currentNum == 8) {
                sb.append("Jam");
            }
            if (currentNum == 9) {
                sb.append("Mack");
            }
        }
        System.out.println(sb.toString());
    }
}