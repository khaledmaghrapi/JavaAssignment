package org.example;
import java.util.Scanner;
public class NumberAnalyzer {

    //Print from 1 to 10 and print beside every number it's type (Even or Odd) Numbers ---------------
    public static void printEvenOrOdd(){
        for (int Number = 1; Number <=10 ; Number++) { // store
            if (Number%2==0){ // if the remainder is zero then print even
                System.out.println(Number+"->Even");
            }else{ // if the remainder isn't zero then print odd
                System.out.println(Number+"->Odd");
            }
            
        }
    }
    //Print Number Descending from 10 to 1 -----------------------------------------------------------
    public static void printNumbersDescending() {
        for (int i = 10; i >=1 ; i--) { // store integer variable->i start the counter from 10 to one until reach to 1
            System.out.println(i);

        }
    }

    //Check Number type even (positive, negative, or zero) ----------------------------------
    public static String checkNumberType(int i) {
        if (i>0){ // if condition method if i greater than zero print positive number
            return "Positive Number";
        } else if (i<0) { // if condition method if i less than zero print positive number
            return "Negative Number";
        }else { // the other choice is i equal to zero then print tne number is zero
            return "The Number is Zero";
        }
    }

    // let the user inter two numbers and calculate the sum of them-----------------------------------
    public static int calculateSum(int number1 , int number2){ // store two integer parameters into the method
        return number1 + number2; // return the summission of the two numbers
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);// demand the user to enter a value

        int choice;

        do {
            // display the menu to the user and he select an operation from them ----------------------
            System.out.println("\n----------------------");
            System.out.println("     Number Analyzer Menu");
            System.out.println("----------------------");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("----------------------");

            System.out.print("Enter your choice: ");

            // Validate menu input
            while (!input.hasNextInt()) { // when the user inter an invalid choice not appear in the menu the message invalid choice will appear
                System.out.println("Invalid Choice");
                input.next(); // the message "Enter your choice: " will appear again to start
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt(); // store the input.nextInt() in a variable-> choice

            switch (choice) { // choice variable is the parameter for the switch case loop

                case 1: // when the choice is 1 from the menu above the printNumbersDescending method will execute

                    System.out.println("\nNumbers from 10 to 1:");
                    printNumbersDescending();
                    break; // out from the case 1 to the choice input

                case 2: //when the choice is 1 from the menu above the printEvenOrOdd method will execute

                    System.out.println("\nEven/Odd Report:");
                    printEvenOrOdd();
                    break; // out from the case 2 to the choice input

                case 3: //when the choice is 3 from the menu above the printEvenOrOdd method will execute

                    System.out.print("Enter a number: ");
                    int number = input.nextInt(); // store input.nextInt in integer variable-> number and put it as parameter in the method

                    String result = checkNumberType(number); // store the result of the method into string variable

                    System.out.println("Number Type = " + result);
                    break; // out from the case 3 to the choice input

                case 4:

                    System.out.print("Enter the first number: ");
                    int number1 = input.nextInt(); // user enter input number and store it into integer variable->number1

                    System.out.print("Enter the second number: ");
                    int number2 = input.nextInt();// user enter input number and store it into integer variable->number2

                    int sum = calculateSum(number1, number2);// store the result of the function inti integer variable->sum

                    System.out.println("Sum = " + sum);// print the summission
                    break; // out from the case 4 to the choice input

                case 5:

                    System.out.println(
                            "Thank you for using Number Analyzer."
                    );
                    break;

                default:
                    // any other choice not from the above cases print Invalid Choice
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        input.close();
    }
    }





