import java.util.*;

public class functions{

    public static int sum(int a , int b){
        int sum = a+b;
        return sum;
    }

    public static int product(int a , int b){
        int prod = a * b;
        return prod;
    }

    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b =temp ;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int factorial(int a){
        int fact = 1;
        for(int i=1 ; i<=a ; i++){
            fact = i * fact;
        }
        return fact;
    }

    public static int binomialcoeff(int n , int r){
        int factn = factorial(n);
        int factr = factorial(r);
        int diff = n-r ;
        int factdiff = factorial(diff);

        int coeff = factn/(factr * factdiff);
        return coeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b = sc.nextInt();

        int sum = sum(a, b);
        System.out.println("Sum of two numbers is = " + sum);

        int prod = product(a, b);
        System.out.println("product of two numbers is = " + prod);

        swap(a, b);

        int facta = factorial(a);
        System.out.println("factorial of "+ a + " = " + facta);

        int factb = factorial(b);
        System.out.println("factorial of "+ b + " = " + factb);

        int binocoeff = binomialcoeff(a, b);
        System.out.println("Binomial coefficient of " + a + " and " + b + " is = " + binocoeff);
    }
}