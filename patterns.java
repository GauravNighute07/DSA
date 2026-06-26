public class patterns{
    public static void main(String[] args) {

        System.out.println("star pattern");
        for(int i=1 ; i<=4 ;i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("inverted star pattern");
        for(int i=1 ; i<=5 ; i++){
            for(int j=5 ; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("half pyramid pattern");
        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println(" ");
        System.out.println("character pattern");
        char ch='A';
        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}