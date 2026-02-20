/*
Name: Ann C.
Course: C155
Assignment: Programming Assignment 4
Date: Feb. 19, 2026
Purpose: Find the largest number and how many times 
it appears from the numbers entered by the user. 
The program stops when the user types "end".
*/

import java.util.Scanner;

public class LargestNumberCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {  // Loop 
            System.out.println("Enter numbers, separated by spaces (type 'end' to stop the program):");
            String line = input.nextLine();
                // to end loop 
            if (line.equalsIgnoreCase("end")) {
                System.out.println("Bye!~");
                break;
            }

            Scanner lineScanner = new Scanner(line);
            boolean firstNumber = true;
            int max = 0;
            int count = 0;

            while (lineScanner.hasNext()) {
                String token = lineScanner.next();
                if (token.equalsIgnoreCase("end")) {
                    break;
                }

                int number = Integer.parseInt(token);
                  // To detact largest number 
                if (firstNumber) {
                    max = number;
                    count = 1;
                    firstNumber = false;
                } else { //set the largest number as max 
                    if (number > max) {
                        max = number;
                        count = 1;
                    } else if (number == max) {
                        count++;
                    }
                }
            }

            if (!firstNumber) {
                System.out.println("The largest number is " + max);
                System.out.println("The occurrence count of the largest number is " + count);
            } else {
                System.out.println("You didn't enter any number!");
            }

            lineScanner.close();
        }
        //Finish 
        input.close();
    }
}
