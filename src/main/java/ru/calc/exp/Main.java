package ru.calc.exp;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter expression like: 1 + 2 + 4 + 5");
        String scan = scanner.nextLine();
        OutClass outClass = new OutClass(scan);
        System.out.println(scan + " = " + outClass.calc());

    }


}
