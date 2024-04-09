import java.util.Scanner;

public class Assign1_Recursion {

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate its factorial : ");
        int number = sc.nextInt();
        sc.close();

        int fact = factorial(number);
        System.out.println("Factorial of "+ number +" is: "+fact);
    }
}
