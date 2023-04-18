package com.Java;


import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void actionBuy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String choice = scanner.next();
        switch (choice) {
            case "1":  // espresso
                if (water >= 250 && beans >= 16 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    beans -= 16;
                    cups -= 1;
                    money += 4;
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (beans < 16) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "2":  // latte
                if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                } else if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beans < 20) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "3":  // cappuccino
                if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                    break;
                } else if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (beans < 12) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cups < 1) {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "back":
                start();
                break;
            default:
                System.out.println("Incorrect number! Please try again.");
                actionBuy();
                break;

        }
    }
    public static void actionFill() {
        System.out.println("Write how many ml of water you want to add: ");
        int addWater = scanner.nextInt();
        water += addWater;
        System.out.println("Write how many ml of milk you want to add: ");
        int addMilk = scanner.nextInt();
        milk += addMilk;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int addBeans = scanner.nextInt();
        beans += addBeans;
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int addCups = scanner.nextInt();
        cups += addCups;
    }
    public static void actionTake() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    public static void start() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        if (action.equals("buy")) {
            actionBuy();
            start();
        } else if (action.equals("fill")) {
            actionFill();
            start();
        } else if (action.equals("take")) {
            actionTake();
            start();
        } else if (action.equals("remaining")) {
            remaining();
            start();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        start();

    }
}