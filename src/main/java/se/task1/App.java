package se.task1;
import java.util.Random;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //__________________________Task 1_______________________________________//

        /*
         1. Write a Java program :
         - to print 'Hello' on screen and then print your name on a separate line.

         Expected result:
         Hello Ali!
         */

        System.out.println("Task 1:");
        System.out.print( "Hello " );
        System.out.println( "Ali!");



        //____________________________Task 2_____________________________________//

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


        //_____________________________Task 3____________________________________//

        /*
        3. Write a Java program to print the sum/multiplication/division and subtraction
        of two numbers Expected result:

        45 + 11 = 56
        12 * 4 = 48
        24 / 6 = 4
        55 – 12 = 43
         */

        System.out.println("Operation two numbers : + , - , / , * ");
        System.out.print("Write the 1th number and press Enter: ");
        Scanner scanFirstNumber = new Scanner(System.in);
        int firstNumber = scanFirstNumber.nextInt();
        System.out.print("Write the 2th number and press Enter: ");
        Scanner scanSecondNumber = new Scanner(System.in);
        int secondNumber = scanSecondNumber.nextInt();
        System.out.print("Write the operation and press Enter: ");
        char operation = scanner.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '*':
                System.out.println("Result: "+ (firstNumber * secondNumber));
                break;
            case '-':
                System.out.println("Result: " + (firstNumber - secondNumber));
                break;
            case '/':
                System.out.println("Result: "+ (firstNumber / secondNumber));
                break;
            default:
                System.out.println("This operation not available");
                break;
        }


        System.out.println("***************");

        //_____________________________Task 4____________________________________//
        /*
        Write a Java program that prints the average of three numbers Expected result:

        (23 + 11 + 77) / 3 = 37
         */

        System.out.println("Operation: (a + b + c ) / d = e");
        System.out.print("Write the 'a' number and press Enter: ");
        Scanner a = new Scanner(System.in);
        int a_num = a.nextInt();
        System.out.print("Write the 'b' number and press Enter: ");
        Scanner b = new Scanner(System.in);
        int b_num = b.nextInt();
        System.out.print("Write the 'c' number and press Enter: ");
        Scanner c = new Scanner(System.in);
        int c_num = c.nextInt();
        System.out.print("Write the 'd' number and press Enter: ");
        Scanner d = new Scanner(System.in);
        int d_num = d.nextInt();

        int result = (a_num + b_num + c_num) / d_num;
        String stringResult = "(" + a_num + "+" + b_num + "+" +
                        c_num + ")/" + d_num;
        System.out.println(stringResult + " = " + result);

        System.out.println("***************");

        //_____________________________Task 5____________________________________//
        /*
        5. Create a program that asks user to input his/her name and store
        it in a variable instead of having fixed name.
        Then print ‘Hello username’ where username is what you got from user as input.
         */
        System.out.print("What is your name: ");
        Scanner scanUserName = new Scanner(System.in);
        String userName = scanUserName.next();
        System.out.println("Hello " + userName);

        System.out.println("***************");

        //_____________________________Task 6____________________________________//

        /*
        6. Create a program that asks user to input two numbers and print
         the sum/multiplication/division and subtraction of given numbers
         */
        System.out.println("Do sum/multiplication/division/subtraction in one click:");
        System.out.print("Write the 1th number: ");
        Scanner scan_FirstNum = new Scanner(System.in);
        int firstNum  = scan_FirstNum.nextInt();

        System.out.print("Write the 2th number: ");
        Scanner scan_SecondNum = new Scanner(System.in);
        int secondNum = scan_SecondNum.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));

        System.out.println("***************");

        //_____________________________Task 7____________________________________//

                /*
        7. Create a program that converts seconds to hours,
        minutes and seconds Input seconds:
        86399 Expected

        output: 23:59:59
         */
        System.out.println("Convert Seconds ---> Hours:Minutes:Seconds");
        System.out.print("Write here: ");
        Scanner scanSecond = new Scanner(System.in);
        int second = scanSecond.nextInt();
        int numOfHour = second/3600;
        int restSecInMinute = (second%3600)/60;
        int restSecond = restSecInMinute%60;
        System.out.println("hh:mm:ss");
        System.out.println(numOfHour+":"+restSecInMinute+":"+restSecond);

        System.out.println("***************");

        //_____________________________Task 8____________________________________//

         /*
        8. Write a program that first generates a random number
        between 1 and 500 and stores it into a variable (see the Random class).
        Then let the user make a guess for which number it is.
        If the user types the correct number, he should be presented with a message
        (including the number of guesses he has made). If he types a number that is greater or
        smaller than the given number, display either “Your guess was too small” or “Your guess was too big”.
        The program should keep executing until the user input the correct guess.
         */
        int start = 0;
        int end = 500;
        Random random = new Random();
        int guessNum = random.nextInt(end -start);
        System.out.println("Guess the number between " + start + " and " + end + ": ");
        System.out.print("Guess: ");
        boolean isNotRight = true;
        while (isNotRight){
            Scanner scanUser = new Scanner(System.in);
            int user = scanUser.nextInt();
            if (user == guessNum) {
                System.out.println("Right");
                isNotRight = false;
            } else if (user > guessNum) {
                System.out.println("Your guess was too big");
                System.out.print("Try again: ");
            } else {
                System.out.println("Your guess was too small");
                System.out.print("Try again: ");
            }
        }
    }


}
