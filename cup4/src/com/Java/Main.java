package com.Java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initial values
        int water = 400;
        int milk = 540;
        int coffebeans = 120;
        int cups = 9;
        int money = 550;

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffebeans + " of coffe beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$"+ money + " of money");
        System.out.println();
        System.out.println("Write action (buy, fill, take):");
        String action=scanner.nextLine();

        switch (action) {
            case "buy" -> {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int buy2 = scanner.nextInt();
                switch (buy2) {
                    case 1 -> {
                        int afterwater = water - 250;
                        int aftercoffe = coffebeans - 16;
                        int aftermoney = money + 4;
                        int aftercups = cups - 1;
                        System.out.println("The coffee machine has:");
                        System.out.println(afterwater + " of water");
                        System.out.println(milk + " of milk");
                        System.out.println(aftercoffe + " of coffe beans");
                        System.out.println(aftercups + " of disposable cups");
                        System.out.println("$" + aftermoney + " of money");
                    }
                    case 2 -> {
                        int afterwater2 = water - 350;
                        int aftercoffe2 = coffebeans - 20;
                        int aftermoney2 = money + 7;
                        int aftercups2 = cups - 1;
                        int aftermilk2 = milk - 75;
                        System.out.println("The coffee machine has:");
                        System.out.println(afterwater2 + " of water");
                        System.out.println(aftermilk2 + " of milk");
                        System.out.println(aftercoffe2 + " of coffe beans");
                        System.out.println(aftercups2 + " of disposable cups");
                        System.out.println("$" + aftermoney2 + " of money");
                    }
                    case 3 -> {
                        int afterwater3 = water - 200;
                        int aftercoffe3 = coffebeans - 12;
                        int aftermoney3 = money + 6;
                        int aftercups3 = cups - 1;
                        int aftermilk3 = milk - 100;
                        System.out.println("The coffee machine has:");
                        System.out.println(afterwater3 + " of water");
                        System.out.println(aftermilk3 + " of milk");
                        System.out.println(aftercoffe3 + " of coffe beans");
                        System.out.println(aftercups3 + " of disposable cups");
                        System.out.println("$" + aftermoney3 + " of money");
                    }
                }
            }
            case "fill" -> {
                System.out.println("Write how many ml of water do you want to add:");
                int add = scanner.nextInt();
                int full = water + add;
                System.out.println("Write how many ml of milk do you want to add:");
                int add2 = scanner.nextInt();
                int full2 = milk + add2;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int add3 = scanner.nextInt();
                int full3 = coffebeans + add3;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int add4 = scanner.nextInt();
                int full4 = cups + add4;
                System.out.println("The coffee machine has:");
                System.out.println(full + " of water");
                System.out.println(full2 + " of milk");
                System.out.println(full3 + " of coffe beans");
                System.out.println(full4 + " of disposable cups");
                System.out.println("$" + money + " of money");
                break;
            }
            case "take" -> {
                int z = money - 550;
                System.out.println("I gave you $ " + money);
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(coffebeans + " of coffe beans");
                System.out.println(cups + " of disposable cups");
                System.out.println("$" + z + " of money");
                break;
            }
        }
    }
}