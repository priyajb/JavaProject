package com.oops.overriding;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter initial amount:");
        double initialBalance = sc.nextDouble();
        Bank myAccount = new Bank(initialBalance);
        while (true) {
            System.out.println("\n choose an option");
            System.out.println("1.withdraw");
            System.out.println("2.deposit");
            System.out.println("3.get balance");


            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter withdrawl amount");
                    double withdrawalAmount = sc.nextDouble();
                    myAccount.withDraw(withdrawalAmount);

                    case2:
                    System.out.println("enter deposit amount");
                    double depositAmount = sc.nextDouble();
                    myAccount.deposit(depositAmount);

                case 3:
                    System.out.println("current balance:" + myAccount.getBalance());

                default:
                    System.out.println("invalid choice");
            }

        }

    }
}
