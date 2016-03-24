package com.company;

import java.util.Scanner;

/**
 * Created by deniz on 15.3.2016 г..
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ln = sc.nextInt();
        char ch = 'a';
        int count = 1;

        while (count < ln){
            for (int i = 0; i <count ; i++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            count++;
            ch = 'a';
        }
        while (count >= 0){
            for (int i = 0; i <count ; i++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
            count--;
            ch = 'a';
        }
    }
}


