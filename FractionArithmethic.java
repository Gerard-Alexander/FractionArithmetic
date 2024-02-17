package src;

import java.util.InputMismatchException;
import java.util.Scanner;

class FractionArithmetic {

    public static void main(String[] args) {
        FractionArithmetic fractionArithmetic = new FractionArithmetic();

        try {
            fractionArithmetic.run();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------");
            System.out.println("What do you want to do?");
            System.out.println("1. Add fractions");
            System.out.println("2. Subtract fractions");
            System.out.println("3. Multiply fractions");
            System.out.println("4. Divide fractions");
            System.out.println("5. Reduce a fraction");
            System.out.println("6. Quit");
            System.out.println("--------------------------");

            System.out.print("Enter Operation Here: ");

            /*
            * code below initiates the operation choices.
            * it also loops the prompt if the user inputs something that is not among
            * the options.
            *
            *
            * might not be needed if the operands are on another method
            * */
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for choice. Please enter a number.");
                scanner.next(); // Clear the invalid input
                continue;
            } if (choice < 1 || choice > 6) {
                System.out.println("Enter a valid number!");
                System.out.print("Enter Operation Here: ");
                scanner.next(); // Clear the invalid input
                continue;

            }
            else if (choice == 6) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }

            //input for fraction
            System.out.println("Enter the first fraction:");
            Fraction fraction1 = getFractionFromUser();

            System.out.println("Enter the second fraction:");
            Fraction fraction2 = getFractionFromUser();


            }
    }//end of run



    /*below is a method used to get the value of the fractions via user input
    * if the user inputs a non-numerical value or 0, it repeats the prompt until the user
    * inputs something valid
    *
    * */
    private Fraction getFractionFromUser() {
        Scanner scanner = new Scanner(System.in);

        int numerator, denominator;

        //numerator
        while (true) {
            try {
                System.out.print("Enter numerator: ");
                numerator = scanner.nextInt();
                break; // Exit the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for numerator. Please enter a valid numeric value.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        //denominator
        while (true) {
            try {
                System.out.print("Enter denominator: ");
                denominator = scanner.nextInt();
                if (denominator != 0) {
                    break; // Exit the loop if input is valid and not equal to zero
                } else {
                    System.out.println("Denominator cannot be zero. Please enter a non-zero value.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for denominator. Please enter a valid numeric value.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        return new Fraction(numerator, denominator);
    }
}//end of class
