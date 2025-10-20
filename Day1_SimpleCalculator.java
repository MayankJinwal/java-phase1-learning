import java.util.Scanner; // Import Scanner class for user input 

public class Day1_SimpleCalculator{

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in); // create Scanner object to take input
       
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();//take first number input

         System.out.print("Enter Second number: ");
        double b = scanner.nextDouble();// take second number input 
        
        System.out.println("Chosse an operation (+, -, *, /): ");
        char op = scanner.next().charAt(0); //take one chracter input for operation

        double result =0; //variable to store input result

        switch(op){
            case '+': result = a+b;
                        break;
            case '-': result = a-b;
                        break;
            case '*': result = a*b;
                        break;
            case '/':
                if(b!=0){
                    result = a/b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; //exit the program if division by zero
                }
                        break;
            default: System.out.println("Invalid operation!");
                        return; //exit the program if invalid operation
        }
             
             System.out.println("Result: "+ result); //print the result
        scanner.close(); //close the scanner

    }
     
    }
       