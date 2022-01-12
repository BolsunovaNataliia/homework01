package com.softserveinc;

import java.util.Scanner;
import static java.lang.Integer.min;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:\n>>> ");
        int water = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has:\n>>> ");
        int milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n>>> ");
        int coffeeBeans = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need:\n>>> ");
        int numberCups = scanner.nextInt();
        if (water == 0 && milk == 0 && coffeeBeans == 0 && numberCups == 0) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (water < numberCups * 200 || milk < numberCups * 50 || coffeeBeans < numberCups * 15) {
            int numberCups2 = min(min(water / 200, milk / 50), coffeeBeans / 15);
            System.out.println("No, I can make only " + numberCups2 + " cup(s) of coffee");
        } else if (water > numberCups * 200 && milk > numberCups * 50 && coffeeBeans > numberCups * 15) {
            int numberCups3 = min(min(water / 200, milk / 50), coffeeBeans / 15);
            if (numberCups3>numberCups) {
                System.out.println("Yes, I can make that amount of coffee (and even " + (numberCups3 - numberCups) + " more than that)");
            } else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        }
    }
}
