import java.util.Scanner;

public class EuclideanDivision {
    public static void main(String[] args) {

        /*beginning title*/
        System.out.println("Euclidean Division");

        /*the name "a" is used in place of the formula for the euclidean division */
        Scanner dividend = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int a = dividend.nextInt();

        /*the name "b" is used due to the formula of the euclidean division */
        Scanner divisor = new Scanner(System.in);
        System.out.print("Enter the divisor: ");
        int b = divisor.nextInt();
        
        /*the variable name "q" is for quotient for the euclidean division */
        Scanner quotient = new Scanner(System.in);
        int q = a/b;

        /*Variable name "r" is for remainder for the euclidean divsion */
        Scanner remainder = new Scanner(System.in);
        int r = a%b;

        
        /*Do we need to add a separate part when it says "This produces a quotient and a remainder"? */
        /*Also, is there any way to make this whole coding text shorter? */
        System.out.print(a );
        System.out.print("=");
        System.out.print(q) ;
        System.out.print("*");
        System.out.print(b);
        System.out.print("+");
        System.out.print(r);
        
    }
}