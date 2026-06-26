import java.util.*;

public class decimalTobinary{
    public static int binaryconversion(int num){
        int p = 0;
        int bin = 0;
        while(num>0){
            int r = num%2;
            bin = bin + (r * (int)Math.pow(10, p));
            p++;
            num = num/2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number : ");
        int num = sc.nextInt();

        System.out.println("binary number is = " + binaryconversion(num));
    }
}