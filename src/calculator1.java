import java.sql.SQLOutput;
import java.util.Scanner;
public class calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.println(" enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("enter your operation(+,-,*,/ ):");
        char operation = scanner.next().charAt(0);
        double result;
        switch (operation){
            case '+':
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            default:
                System.out.println("invalid operation");
                return;


        }
        System.out.println("result:" + result );
        scanner.close();
    }
}
