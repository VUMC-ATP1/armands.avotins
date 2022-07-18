package main.java.homeworkTwo;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {
        uzdevums1();
        uzdevums2();
        uzdevums3();
        uzdevums4();
        uzdevums5();
        uzdevums6();
        uzdevums7();
        uzdevums8();
    }


    public static void uzdevums1() {

//
        int x = 6;
        System.out.printf("x>0, x= %d  - %b%n", x, (x > 0));
        System.out.printf("x<0, x= %d  - %b%n", x, (x < 0));
        System.out.printf("5<x=<10, x= %d  - %b%n", x, (x > 5 && x <= 10));
        System.out.printf("5<x=<10, x= %d  - %b%n", x, (x >= 5 && x <= 10));  // ja x nav mazāks vai vienāds ar 5 , tad tas ir lielāks par 5.
        System.out.printf("5 nav 0 un 5 nav 10 - %b%n", (x == 0 || x == 10));
        System.out.printf("5 *5 ir lielāks par 10 - %b%n", (x * x > 10));

    }

    public static void uzdevums2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input month number from 1 to 12");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("1st month is January");
                break;
            case 2:
                System.out.println("2nd month is February");
                break;
            case 3:
                System.out.println("3rd month is March");
                break;
            case 4:
                System.out.println("4th month is April");
                break;
            case 5:
                System.out.println("5th month is May");
                break;
            case 6:
                System.out.println("6th month is June");
                break;
            case 7:
                System.out.println("7th month is July");
                break;
            case 8:
                System.out.println("8th month is August");
                break;
            case 9:
                System.out.println("9th month is September");
                break;
            case 10:
                System.out.println("10th month is October");
                break;
            case 11:
                System.out.println("11th month is November");
                break;
            case 12:
                System.out.println("12th month is December");
                break;
            default:
                System.out.println("Incorrect month number");
                break;
        }
    }

    public static void uzdevums3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide 3 numbers");
        System.out.println("Number 1 ");
        int num1 = sc.nextInt();
        System.out.println("Number 2 ");
        int num2 = sc.nextInt();
        System.out.println("Number 3 ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("%d is greater than %d and %d%n", num1, num2, num3);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("%d is greater than %d and %d%n", num2, num1, num3);
        } else {
            System.out.printf("%d is greater than %d and %d%n", num3, num1, num2);
        }
    }


    public static void uzdevums4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Luksoforā šobrīd deg X krāsa");
        String krasa = sc.nextLine();

        if (krasa.equalsIgnoreCase("Zaļa")) {
            System.out.println("Ej droši pāri");

        } else if (krasa.equalsIgnoreCase("dzeltena")) {
            System.out.println("Ātri pabeidz kustību, vai gaidi zaļo");
        } else if (krasa.equalsIgnoreCase("sarkana")) {
            System.out.println("Gaidi zaļo");
        } else {
            System.out.println("Vai nu nestandarta luksofors(iespējams no Ķīnas), vai luksofors šobrīd nedarbojas");
        }
    }

    public static void uzdevums5() {
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();
    }

    public static void uzdevums6() {
        printBusinessCardTwo("Lainis", "Lielais", "+371 12345678", 1996);
        printBusinessCardTwo("Žanis", "Vanis", "+371 11111111", 2022);
    }

    public static void uzdevums7() {
        System.out.println( "summa "+sum(5, 7));

    }

    public static void uzdevums8() {
        System.out.println("Vidējais aritmētiskais :"+average(5, 6, 9));

    }

    /**
     * Skaita 2 skaitļus
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Izvelk vidējo no 3 skaitļiem
     */
    public static double average(double a, double b, double c) {
        return ((a + b + c) / 3);
    }


    /**
     * Patīk printēt vienu un to pašu
     */
    public static void printBusinessCard() {
        System.out.print("""
                Vizītkarte
                +++++++++++++
                Vārds: Jānis
                Uzvārds: Spānis
                Tel nr.: +371 20000007
                Dzimis: 1993
                ++++++++++++++++++
                """);
    }

    /**
     * Patīk printēt dažādas lietas
     */
    public static void printBusinessCardTwo(String name, String surname, String telephone, int yearOfBirth) {
        System.out.printf("""
                Vizītkarte
                +++++++++++++
                Vārds: %s
                Uzvārds: %s
                Tel nr.: %s
                Dzimis: %d
                ++++++++++++++++++
                """, name, surname, telephone, yearOfBirth);
    }
}
