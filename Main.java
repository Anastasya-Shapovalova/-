package com.java.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = console.nextInt();
        System.out.println("Введите число b");
        int b = console.nextInt();
        int sum, sub, mult;
        double div = 0.0;

        if (a == b)
            System.out.println("a равно b");
        else
        {
            if (a > b)
                System.out.println("a больше b");
            else
                System.out.println("a меньше b");
        }
        sum = a + b;
        sub = a - b;
        mult = a * b;
        if (b == 0)
        {
            System.out.println("Делить на 0 нельзя");
        }
        else
        {
            div = (double)a/b;
        }
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + sub);
        System.out.println("Деление чисел: " + div);
        System.out.println("Умножение чисел: " + mult);

    }
}


