
import java.util.*;

public class binaryTodecimal{

    public static int decimalconversion(int num){
        int dec = 0;
        int p =0 ;
        while(num>0){
            int ld = num%10;
            dec = dec + (ld * (2<<p));
            p++;
            num=num/10;
        }
        return dec ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number : ");
        int num = sc.nextInt();

        System.out.println("Decimal conversion of " + num + " is = " + decimalconversion(num));
    }
}