import java.util.Scanner;

public class calculatorconsol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter following number to profrom Calculation \n 1. ADDITION\n 2. SUBSTRATION \n 3. MULTIPLICATION \n 4. DIVISION");
        int a = scanner.nextInt();
        System.out.println("Enter two numbers to profrom Calculation");
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        switch (a) {
            case 1: 
                System.out.println("sum of two number is : " + (b + c));
                break; 
            case 2: 
                System.out.println("substration of two numbers is : " + (b - c));
                break;
            case 3:
                System.out.println("product of two numbers is : " + (b * c));
                break;
            case 4:
                if (  b <= 0 || c <= 0 ) {
                    System.out.println("Error : Enter a valid number (positive)");
                }
                else {
                    System.out.println("Division of two numbers is : "+ (b/c));
                }
            default:
                System.out.println("Error");
                break;
        }

    }
}