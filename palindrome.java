
import java.util.*;

public class palindrome{

    public static boolean isPalindrome(int num){
        int og = num;
        int newNum = 0;
        while(num>0){
            int r = num%10;
            newNum = newNum * 10 + r;
            num = num/10;
        }
        System.out.println(newNum);
        if(newNum == og){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enetr a number : ");
        int num = sc.nextInt();

        System.out.println("is number a palindrome ? : " + isPalindrome(num));
        
    }
}