// import the Scanner class
import java.util.Scanner;

public class Kfc {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        // Method call
        revealMyOrdername();
       
        
        // Method call
        // int sum = add();
        // System.out.println("The sum is: " + sum);


          // Close scanner
          scan.close();
    
    }
    static void revealMyOrdername() {
        try (Scanner scanning = new Scanner(System.in)) {
            System.out.println("Please enter your first order!:");
               String x = scanning.next();
               System.out.println("Please enter your first price!:");
               Double a = scanning.nextDouble();

               scanning.nextLine();

               System.out.println("Please enter your second order!:");
               String y = scanning.next();
               System.out.println("Please enter your second price!:");
               Double b = scanning.nextDouble();

               scanning.nextLine();

               System.out.println("Please enter your third order!:");
               String z = scanning.next();
               System.out.println("Please enter your third price!:");
               Double c = scanning.nextDouble();
               Double totalamount= a+b+c ;

        System.out.println(" Your 1st order is " + x  + "\n" + " Your 2nd order is " + y + "\n" + " Your 3rd Order " + z  + "\n" + " Your total amount is " + totalamount );
    
        

            
        }

               
        }
        static int add() {
            System.out.println("Please enter two numbers to add");
            System.out.println("Enter first number: ");
            int x = scan.nextInt();
    
            System.out.println("Enter second number: ");
            int y = scan.nextInt();
            return x + y;
        } 

        }
    
        
    


  
    
    


