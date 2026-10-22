/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopslab_java.java;

import java.util.Scanner;

/**
 *
 * @author Cedeenoo
 */
public class LoopsLab_javaJava {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== JAVA LOOP ACTIVITIES =====");
            System.out.println("1. Multiplication Table");
            System.out.println("2. Sum of Natural Numbers");
            System.out.println("3. Factorial Calculator");
            System.out.println("4. Even and Odd Numbers");
            System.out.println("5. Reverse Digits"); 
            System.out.println("0. Exit");
            System.out.print("Choose an activity: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int num = input.nextInt();

                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i
                                + " = " + (num * i));
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    int i = 1;
                    int sum = 0;

                    while (i <= n) {
                        sum += i;
                        i++;
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    System.out.print("Enter a number: ");
                    int number = input.nextInt();

                    if (number < 0) {
                        System.out.println(
                            "Factorial is not defined for negative numbers.");
                    } else if (number > 20) {
                        System.out.println(
                            "Please enter a number from 0 to 20.");
                    } else {
                        long factorial = 1;
                        int j = 1;

                        do {
                            factorial *= j;
                            j++;
                        } while (j <= number);

                        System.out.println("Factorial = " + factorial);
                    }
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int limit = input.nextInt();

                    System.out.print("Even numbers: ");
                    for (int k = 1; k <= limit; k++) {
                        if (k % 2 == 0) {
                            System.out.print(k + " ");
                        }
                    }

                    System.out.print("\nOdd numbers: ");
                    for (int k = 1; k <= limit; k++) {
                        if (k % 2 != 0) {
                            System.out.print(k + " ");
                        }
                    }

                    System.out.println();
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int original = input.nextInt();
                    int reversed = 0;
                    int digit;
                    int temp = Math.abs(original);

                    while (temp != 0) {
                        digit = temp % 10;
                        reversed = reversed * 10 + digit;
                        temp /= 10;
                    }

                    if (original < 0) {
                        reversed = -reversed;
                    }

                    System.out.println("Reversed: " + reversed);
                    break;

                case 0:
                    System.out.println("Program ended. Thank you!");
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please try again.");
            }

        } while (choice != 0);

        input.close(); 
    }
}

