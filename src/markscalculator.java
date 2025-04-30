import java.util.Scanner;
public class markscalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your integer ");
        int a = sc.nextInt();
        System.out.println("Your first integer is "+a );
        System.out.println("Write your second integer");
        int b = sc.nextInt();
        System.out.println("Your second integer is "+b );
        int sum = a+b;
        System.out.println("The sum of your integer is " +sum);



    }
}
