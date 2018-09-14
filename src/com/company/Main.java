package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kbreader = new Scanner(System.in);

        System.out.println("Please enter your first input.");
        int numberOne = kbreader.nextInt();

        System.out.println("Please enter your second input.");
        int numberTwo = kbreader.nextInt();

        System.out.println("Would you like to add, subtract, multiply, or divide?");
        String command = kbreader.next();

        if (command.equalsIgnoreCase("add")) {
            double solution = Math.cos(numberOne + numberTwo);
            System.out.println("The sum of " + numberOne + " and " + numberTwo + " is " + solution + ". Are you satisfied?");

            String satisfy = kbreader.next();

            if (satisfy.equalsIgnoreCase("no")){
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String method = kbreader.next();

                if (method.equals("cos")) {
                    System.out.println("Great! Good job and goodbye!");

                }
                else {
                System.out.println("Oops! Better luck next time! Goodbye!");
                    }}
            else {
                    System.out.println("Great! Good job and goodbye!");
                }
                }
        else if (command.equalsIgnoreCase("subtract")){
            double solution = Math.sqrt(numberOne - numberTwo);
            System.out.println("The difference of " + numberOne + " and " + numberTwo + " is " + solution + ". Are you satisfied?");

            String satisfy = kbreader.next();

            if (satisfy.equalsIgnoreCase("no")){
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String method = kbreader.next();

                if (method.equals("sqrt")) {
                    System.out.println("Great! Good job and goodbye!");

                }
                else {
                    System.out.println("Oops! Better luck next time! Goodbye!");
                }}
            else {
                System.out.println("Great! Good job and goodbye!");
            }
        }
        else if (command.equalsIgnoreCase("multiply")) {
            double solution = Math.sin(numberOne * numberTwo);
            System.out.println("The product of " + numberOne + " and " + numberTwo + " is " + solution + ". Are you satisfied?");

            String satisfy = kbreader.next();

            if (satisfy.equalsIgnoreCase("no")){
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String method = kbreader.next();

                if (method.equals("sin")) {
                    System.out.println("Great! Good job and goodbye!");

                }
                else {
                    System.out.println("Oops! Better luck next time! Goodbye!");
                }}
            else {
                System.out.println("Great! Good job and goodbye!");
            }
        }
        else if (command.equalsIgnoreCase("divide")) {
            double solution = Math.floor(numberOne / numberTwo);
            System.out.println("The quotient of " + numberOne + " and " + numberTwo + " is " + solution + ". Are you satisfied?");

            String satisfy = kbreader.next();

            if (satisfy.equalsIgnoreCase("no")){
                System.out.println("Can you identify what math class method I ran the real answer through?");
                String method = kbreader.next();

                if (method.equals("floor")) {
                    System.out.println("Great! Good job and goodbye!");

                }
                else {
                    System.out.println("Oops! Better luck next time! Goodbye!");
                }}
            else {
                System.out.println("Great! Good job and goodbye!");
            }
        }
        }
        }