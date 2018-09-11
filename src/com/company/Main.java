package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kbreader = new Scanner(System.in);

        System.out.println("Would you like to add, subtract, multiply, or divide?");
        String command = kbreader.nextLine();

        System.out.println("Please enter your first input.");
        int numberOne = kbreader.nextInt();

        System.out.println("Please enter your second input.");
        int numberTwo = kbreader.nextInt();

        if (command = = "add") {
            int solution = Math.ceil(numberOne + numberTwo);
            System.out.println("The sum of " + numberOne + " and " + numberTwo " is " + solution + ". Are you satisfied?");

            String satisfy = kbreader.nextLine();

            if (satisfy.length() == 2){
                System.out.println("Can you identify what math class method I ran the real answer through?");


            }
        }
    }
}
