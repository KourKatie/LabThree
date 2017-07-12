package com.jetbrains;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userNum = 0;
        int i = 1;
        int squaredNum = 0;
        int cubedNum = 0;
        String answer = "";

        Scanner scnr = new Scanner(System.in);

        do {

            System.out.print("Please enter an integer: ");
            userNum = scnr.nextInt();

            System.out.println("Number\t" + "Squared\t" + "Cubed\t");
            System.out.println("=======\t" + "=======\t" + "=======\t");

            for (i = 1; i <= userNum; i++) {
                System.out.println(i + "\t\t" + (int) (Math.pow((i), 2)) + "\t\t" + (int) (Math.pow((i), 3)));
            }

            System.out.println("Do you wish to continue(y/n)? ");
            answer = scnr.next();
        } while (answer.equals("y"));

        return;
    }
}
