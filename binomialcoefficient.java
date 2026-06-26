import java.util.*;

public class binomialcoefficient{

    public static int factorial(int n){
        int fact = 1 ;
        for(int i=1 ; i<=n ; i++){
            fact = fact*i;
        }
        return fact ;
    }

    public static int binomialcoefficient(int n , int r){
        int factn = factorial(n);
        int factr = factorial(r);

        int diff = n-r;
        int factdiff = factorial(diff);

        int coeff = factn / (factr * factdiff) ;
        return coeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        System.out.println("Binomial coefficient of " + a + " and " + b + " is = " + binomialcoefficient(a,b));

    }
}