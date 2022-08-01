package org.example;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;
        if(number1 > number2) System.out.println("Pierwsza liczba jest większa");
        else if(number1 < number2) System.out.println("Druga liczbajest większa");
    }
}