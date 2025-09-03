import java.util.Scanner;

public class EuclideanDivision {
    public static void main(String[] args) {

        System.out.println("Euclidean Division");

        Scanner dividend = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int a = dividend.nextInt();

        Scanner divisor = new Scanner(System.in);
        System.out.print("Enter the divisor: ");
        int b = divisor.nextInt();
        
        
        Scanner quotient = new Scanner(System.in);
        int q = a/b;

        Scanner remainder = new Scanner(System.in);
        int r = a%b;

        
        /*Do we need to add a separate part when it says "This produces a quotient and a remainder"? */
        System.out.print(a );
        System.out.print("=");
        System.out.print(q) ;
        System.out.print("*");
        System.out.print(b);
        System.out.print("+");
        System.out.print(r);
        
    }
}