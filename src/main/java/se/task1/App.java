package se.task1;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        /*
         1. Write a Java program :
         - to print 'Hello' on screen and then print your name on a separate line.

         Expected result:
         Hello Ali!
         */
        System.out.println("Task 1:");
        System.out.print( "Hello " );
        System.out.println( "Ali!");

        /*
        2. Create a program that takes a year as input from user and
        print if it’s leap year or not. */
        System.out.println("***************");
        System.out.println("Task 2:");
        System.out.println("Write the year to see if it is leap year or not and press Enter:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
    } else {
            System.out.println(year +" is NOT a leap year.");
        }
        System.out.println("***************");
        /*
        3. Write a Java program to print the sum/multiplication/division and subtraction
        of two numbers Expected result:

        45 + 11 = 56
        12 * 4 = 48
        24 / 6 = 4
        55 – 12 = 43
         */
        System.out.println("Operation:");
        System.out.print("Write the first number and press Enter: ");
        Scanner scanFirstNumber = new Scanner(System.in);
        int firstNumber = scanFirstNumber.nextInt();
        System.out.print("Write the second number and press Enter: ");
        Scanner scanSecondNumber = new Scanner(System.in);
        int secondNumber = scanSecondNumber.nextInt();
        System.out.print("Write the operation and press Enter: ");
        char operation = scanner.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("This operation not available");
                break;
        }



    }
}
