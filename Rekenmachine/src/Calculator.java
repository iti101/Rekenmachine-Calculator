import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
// create new variable "numbers" as container the user-input
        Scanner numbers = new Scanner(System.in);
// print "Please enter two numbers: " to screen
        System.out.print("Please enter two numbers: ");
// nextDouble() reads the numbers entered by user
        double first = numbers.nextDouble();
        double second = numbers.nextDouble();
// print "Enter an operator (+, -, *, /): " to screen
        System.out.print("Enter an operator (+, -, *, /): ");
// next().charAt(0) reads the numbers entered by user
        char operator = numbers.next().charAt(0);
// creates variable to contain the result of the calculation
        double answer;
// switch case for each of the entered operator possibilities
        switch(operator)
        {
// in 'case' of addition
            case '+':
                answer = first + second;
                break;
// in 'case' of subtraction
            case '-':
                answer = first - second;
                break;
// in 'case' of multiplication
            case '*':
                answer = first * second;
                break;
// in 'case' of division
            case '/':
                answer = first / second;
                break;
// prints out "Error! operator is not correct" in case user-entered operator isn't correct
            default:
                System.out.print("Error! operator is not correct");
                return;
        }
//printing the result of the operations
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, answer);
    }
}
