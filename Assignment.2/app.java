// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        // Method call
        int product = multiply();
        System.out.print("The product is !: " + product);
  
        // Method call

        int quotient = divide();
        System.out.print("The quotient is!:" + quotient );

            // Method call
            String crushName = revealMyCrushes();
            System.out.print(crushName);
    
  
         
        // Close scanner
        scan.close();
    }
    


    static int multiply() {
        System.out.println("please enter two numbers to multiply");
        System.out.print("Enter first number!:");
        int x = scan.nextInt();

        System.out.print("enter second number!:");
        int y = scan.nextInt();
        return x * y; 

    }

    static int divide() {
        System.out.println("please enter two numbers to divide");
        System.out.print("Enter first number !: ");
        int x = scan.nextInt();

        System.out.print("enter second number !: ");
        int y = scan.nextInt();
        return x / y; 

    }
    static String revealMyCrushes() {
        try (Scanner scanning = new Scanner(System.in)) {
            System.out.print("Please enter your name!:");
               String x = scanning.nextLine();
               System.out.print("Please enter the name of your first crush!:");
               String y = scanning.nextLine();
               System.out.print("Please enter the name of your second crush!:");
               String z = scanning.nextLine();

               return "he's " + x  + "Has " + y  + "and loves " + z;
        }
    }
       
       



}
