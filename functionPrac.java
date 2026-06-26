
import java.util.*;

public class functionPrac{
    public static int average(int a, int b,int c){
        int sum = a+b+c;
        return sum/3;
    }

    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }
        return false;
    }

    public static int digitSum(int num){
        int sum = 0;
        while(num>0){
            int r = num%10;
            sum = sum+r;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int c = sc.nextInt();

        System.out.println("Average = " + average(a, b, c));

        System.out.println("is a even ? " + isEven(a));

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Sum of digits in the number is : " + digitSum(num));

    }
}