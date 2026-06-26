
import java.util.*;

public class PrimeNumber{

    public static boolean isPrime(int num){
        if(num==2){
            return true;
        }
        else if(num<=1){
            return false;
        }
        for(int i=2 ; i<num ; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printprime(int num){
        for(int i=2 ; i<=num ; i++){
           if(isPrime(i)){
                System.out.println(i);
           }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        printprime(num);
        // System.out.println(isPrime(num));
    }
}