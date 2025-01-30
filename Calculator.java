
import java.util. Scanner;

public class Calculator {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value");
        int b=sc.nextInt();
        System.out.println("select your option");
        System.out.println("1:addition");
        System.out.println("2:subtraction");
        System.out.println("3 multiple");
        System.out.println("4 division");
        System.out.println("5 modulus");
        int opt = sc.nextInt();
        switch (opt){
    
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            case 5:
            System.out.println(a%b);
            break;
            default:
            System.out.println("invalid");

        }
    }
    
}
