package com.nextme.project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        /**
         *
         *
         *
         *
         * */
        String name="This is my first java project";
        System.out.println("  " + name);
        int num1 = 17;
        int num2 = 12;
        int num3 = 7;
        int num4, num5, num6;
        num4=4; num5=12; num6=20;
        int num7=22, num8=25, num9=100;
        int sum = num1 + num2 + num3 + num4 + num5 + num6 +num7 +num8 +num9;
                System.out.println("summa  " + sum);

                //double
        double zarplata = 536.78;
        double zarplata1 = 647.90;
        double zarplata2 = 563.80;
        double zarSumma = zarplata+zarplata1+zarplata2;
        double zarUmnojen = zarplata*zarplata1*zarplata2;
        System.out.println("Zarplata: " + zarSumma+" $");
        System.out.println("ZarUmnojen: " +  zarUmnojen+" $");
        //cmd - terminal

        Scanner scanner = new Scanner(System.in);
        System.out.print( "num kiriting : ");

        int znacheniya = scanner.nextInt();
        int umn1=znacheniya*3;
        System.out.println("umn1 = :" + umn1);
        System.out.println("-------------");

    //
        System.out.print("Your name: ");
        String fullName = scanner.nextLine();
        System.out.println(" My name is " + fullName);
    }
}
