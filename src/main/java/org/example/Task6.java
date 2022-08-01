package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        getFactorial(number);

        for(int i = 0; i < 10; i++){
            getFactorial(number);
        }
    }

    private static void getFactorial(int number){
        int result = 1;
        for(int i = 2; i <= number; i++){
            result *= i;
        }
        System.out.println(result);
    }
}


/*public class Main { // metody z intami
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(silnia(input));

        for(int c = 0; c <10; c++) {
            System.out.println(silnia(c));
        }
    }
    public static int silnia(int i) {
        int result = 1;
        for(int j = 2; j <= i; j++) {
            result *= j;
        }
        return result;
    }
}*/
