package conditionalStatement;

public class ifElse {
    public static void main(String[] args) {

        // Uncomment this block if you want to check voting eligibility
        /*
        int age = 24;
        if(age >= 18){
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
        */

        // Day schedule block
        System.out.println("Day schedule");

        int day = 3;
        if (day == 1) {
            System.out.println("Go to Home");
        } else if (day == 2) {
            System.out.println("Go to the village");
        } else if (day == 3) {
            System.out.println("Go to party");
        } else {
            System.out.println("Go to office");
        }

        System.out.println("Went somewhere today");

        // Finding the maximum of three numbers
        int a = 4;
        int b = 8;
        int c = 1;

        if (a >= b && a >= c) {
            System.out.println("a is the largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("b is the largest: " + b);
        } else {
            System.out.println("c is the largest: " + c);
        }
    }
}
