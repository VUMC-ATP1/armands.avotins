package main.java.homework;

import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        /*uzdevums1();


        uzdevums2();

        uzdevums3();

        uzdevums4();

        uzdevums5();



        uzdevums6();
 */
        extraUzdevums7();
    }

    public static void uzdevums1() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x <= 100) {
            System.out.println("Ievadi skaitli");
            x += sc.nextInt();
        }
        System.out.println("Gatavs!");
    }

    public static void uzdevums2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi skaitli");
        int x = sc.nextInt();
        int flag = 0;


        if (x == 0 || x == 1) {
            System.out.println(x + " is not prime number");
        } else {
            for (int i = 2; i <= 9999; i++) {
                if (x % i == 0) {
                    System.out.println(x + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(x + " is prime number");
            }
        }
    }

    public static void uzdevums3() {
        int[] cipari = {1, 2, 3, 4, 5, 6, 7};
        String[] vardi = {"Alus", "Šņabis", "Vīns", "Viskijs", "Liķieris", "Džins"};
        char[] burti = {'S', 'U', 'P', 'E', 'R'};

        //------------------------a while
        System.out.println("while loop");
        int i = 0;
        while (i < cipari.length) {
            System.out.println(cipari[i]);
            i++;
        }

        i = 0;
        while (i < vardi.length) {
            System.out.println(vardi[i]);
            i++;
        }

        i = 0;
        while (i < burti.length) {
            System.out.println(burti[i]);
            i++;
        }
        //------------------------b do while
        System.out.println("do while loop");
        i = 0;
        do {
            System.out.println(cipari[i]);
            i++;
        }

        while (i < cipari.length);

        i = 0;
        do {
            System.out.println(vardi[i]);
            i++;
        }
        while (i < vardi.length);

        i = 0;
        do {
            System.out.println(burti[i]);
            i++;
        }
        while (i < burti.length);
        //------------------------c for
        System.out.println("for loop");

        for (int j = 0; j < cipari.length; j++) {
            System.out.println(cipari[j]);
        }
        for (int j = 0; j < vardi.length; j++) {
            System.out.println(vardi[j]);
        }
        for (int j = 0; j < burti.length; j++) {
            System.out.println(burti[j]);
        }
        //------------------------d foreach
        System.out.println("foreach loop");
        for (int a : cipari) {
            System.out.println(a);
        }

        for (String a : vardi) {
            System.out.println(a);
        }

        for (char a : burti) {
            System.out.println(a);
        }
    }

    public static void uzdevums4() {
        int[] cipari = new int[100];
        for (int i = 0; i < cipari.length; i++) {
            cipari[i] = i * 2;
        }
// izvadam
        for (int a : cipari) {
            System.out.println(a);

        }

    }

    public static void uzdevums5() {
        int skaitlis = 5;
        int faktorials = 1;
        System.out.printf("%d!= ", skaitlis);
        for (int i = 0; i < skaitlis; skaitlis--) {
            faktorials *= skaitlis;
            System.out.printf("%d*", skaitlis);
        }
        System.out.println("=" + faktorials);
    }

    public static void uzdevums6() {
        final int pin = 1234;
        int triesLeft = 2; //
        Scanner sc = new Scanner(System.in);

        int userPin;
    do {
        System.out.println("Ievadi kartes PIN");
        userPin = sc.nextInt();
        if (userPin == pin) {
            System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
            break;
        } else if(triesLeft<=0){
            System.out.println("Atvainojiet, bet jūs esat bloķēts");
            break;
        }
        else {
            System.out.println("Nepareizs PIN, mēģiniet vēlreiz");
            triesLeft -= 1;

        }
    }
        while (triesLeft >= 0) ;

    }

    public static void extraUzdevums7() {
       int maxtries=10;
        int triesLeft = maxtries-1; // slinkums pārrakstīt lai skaita plusā  nevis -- :D
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(51);
        int guess;
        System.out.printf("minam skaitli no 0 - 50 %d%n",randomNumber);
        do {
            System.out.println("Ievadi savu minējumu!");
            guess = sc.nextInt();
            if (guess == randomNumber) {
                System.out.printf("Wow, uzminēji, skaitlis tiešām bija %d%n",randomNumber);
                System.out.printf("Uzminēji ar  %d. minējumu!%n",maxtries-triesLeft);
                break;
            } else if(triesLeft<=0){
                System.out.printf("Neuzminēji skaitli 10 reizēs, minamais skaitlis bija %d",randomNumber);
                break;
            }
            else {
                triesLeft -= 1;
                if(guess > randomNumber) {
                    System.out.println("Minamais skaitlis ir mazāks");
                }
                else {
                    System.out.println("Minamais skaitlis ir lielāks");
                }


            }
        }
        while (triesLeft >= 0) ;
    }
}
