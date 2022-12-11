package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);

    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;
    public static boolean power = true;

    //Print the current amount of resources
    public static void printCurrentAmount () {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
        System.out.println();
    }

    //Make espresso
    public static void makeEspresso () {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            water = water - 250;
            beans = beans - 16;
            money = money + 4;
            cups = cups - 1;
        } else {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
                System.out.println();
            } else if (beans < 16) {
                System.out.println("Sorry, not enough beans!");
            }else if (cups < 1) {
                System.out.println("Sorry, not enough disposable cups");

            }
        }
    }

    //Make latte
    public static void makeLatte () {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            water = water - 350;
            milk = milk - 75;
            beans = beans - 20;
            money = money + 7;
            cups = cups - 1;
        } else {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
                System.out.println();
            }else if (milk < 75){
                System.out.println("Sorry not enough milk!");
            } else if (beans < 20) {
                System.out.println("Sorry, not enough beans!");
            }else if (cups < 1) {
                System.out.println("Sorry, not enough disposable cups");

            }
        }
    }

    //Make cappuccino
    public static void makeCappuccino () {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            water = water - 200;
            milk = milk - 100;
            beans = beans - 12;
            money = money + 6;
            cups = cups - 1;
        } else {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
                System.out.println();
            }else if (milk < 100){
                System.out.println("Sorry not enough milk!");
            } else if (beans < 12) {
                System.out.println("Sorry, not enough beans!");
            }else if (cups < 1) {
                System.out.println("Sorry, not enough disposable cups");

            }
        }
    }

    //Refill the coffee machine
    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        water = water + addWater;

        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        milk = milk + addMilk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        beans = beans + addCoffeeBeans;

        System.out.println("Write how many disposable cups you want to add:");
        int addCups = scanner.nextInt();
        cups = cups + addCups;

    }

    public static void main(String[] args) {

        while (power) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = scanner.nextLine();

            switch (option) {
                case "buy":
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            makeEspresso();
                            break;
                        case "2":
                            makeLatte();
                            break;
                        case "3":
                            makeCappuccino();
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println();
                    fill();
                    break;
                case "take":
                    System.out.println();
                    System.out.println("I gave you " + "$" + money);
                    System.out.println();
                    money = 0;
                    break;
                case "remaining":
                    System.out.println();
                    printCurrentAmount();
                    break;
                case "exit":
                    power = false;
                    break;
            }
        }
    }
}