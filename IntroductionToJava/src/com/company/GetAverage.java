package com.company;

import org.omg.CORBA.Current;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

/**
 * Created by deniz on 15.3.2016 г..
 */
public class GetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        double a = sc.nextDouble();
        System.out.println("Enter second Number:");
        double b = sc.nextDouble();
        System.out.println("Enter third Number:");
        double c = sc.nextDouble();
        double result = average(a,b,c);
        System.out.println(String.format("%.2f", result));
    }

    public static double average (double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
