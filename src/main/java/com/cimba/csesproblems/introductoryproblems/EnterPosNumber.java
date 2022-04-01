package com.cimba.csesproblems.introductoryproblems;

import java.util.Scanner;

public class EnterPosNumber {
    public void CheckNumber(){
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please, enter a positive number.");
            while (!scanner.hasNextInt()){
                System.out.println("That not a number!");
                scanner.next();
            }
            n = scanner.nextInt();
        }while (n <= 0);
        System.out.println("Thank you, got " + n + ".\n");
    }
}
