package com.google.test;

import java.util.Scanner;

/**
 * @author Angus
 * @date 2023/2/15 15:36
 */
public class TestObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input first number:");
        int a = sc.nextInt();

        System.out.println("input second number:");
        int b = sc.nextInt();

        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);

        System.out.println("result: "+result);
    }


}
