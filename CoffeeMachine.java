package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static boolean run = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println(" ");
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    machineHas();
                    break;
                default:
                    run = false;
                    break;
            }
        }

    }
    private static void machineHas() {
        System.out.println(" ");
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    static void buy() {
        System.out.println(" ");
        System.out.println("What do you want to buy? 1 - espresso," +
                "2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "1":
                espresso();
                break;
            case "2":
                latte();
                break;
            case "3":
                cappuccino();
                break;
            default:
                break;
        }
    }
    static void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans  do you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }
    static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    static void espresso() {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250;
            beans -= 16;
            money += 4;
            cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough cups!");
        }

    }
    static void latte() {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            water -= 350;
            milk -= 75;
            beans -= 20;
            money += 7;
            cups -= 1;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 20) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough cups!");
        }
    }
    static void cappuccino() {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups -= 1;
            money += 6;
            System.out.println("I have enough resources, making you a coffee!");
        } else if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 16) {
            System.out.println("Sorry, not enough coffee beans!");
        } else {
            System.out.println("Sorry, not enough cups!");
        }
    }
}