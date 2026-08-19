import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int choice = 0;
    
    while (choice != 12) {
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      System.out.println("5. Square Root");
      System.out.println("6. Square");
      System.out.println("7. Sine");
      System.out.println("8. Cosine");
      System.out.println("9. Tangent");
      System.out.println("10. Natural Logarithm");
      System.out.println("11. Exponential e function");
      System.out.println("12. Exit");
      
      System.out.println("Enter the number for the option that you want to do");
      choice = input.nextInt();
      
      if (choice == 1) {
        System.out.println("Enter first number, press enter, then enter second number.");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        
        double result = num1 + num2;
        System.out.println("Result: " + result);
      }
      else if (choice == 2) {
        System.out.println("Enter first number, press enter, then enter second number.");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        
        double result = num1 - num2;
        System.out.println("Result: " + result);
      }
      else if (choice == 3) {
        System.out.println("Enter first number, press enter, then enter second number.");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        
        double result = num1 * num2;
        System.out.println("Result: " + result);
      }
      else if (choice == 4) {
        System.out.println("Enter first number, press enter, then enter second number.");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        
        if (num2 == 0) {
          System.out.println("Cannot divide by zero.");
        }
        else {
          double result = num1 / num2;
          System.out.println("Result: " + result);
        }
      }
      else if (choice == 5) {
        System.out.println("Enter the number that you would like to square root");
        double num1 = input.nextInt();
        double result = Math.sqrt(num1);
        System.out.println("Result: " + result);
      }
      else if (choice == 6) {
        System.out.println("Enter the number that you want to square.");
        double num1 = input.nextInt();
        double result = Math.pow(num1, 2);
        System.out.println("Result" + result);
      }
      else if (choice == 7) {
        System.out.println("Enter the number that you would like to find the sine of.");
        double num1 = input.nextInt();
        double result = Math.sin(num1);
        System.out.println("Result: " + result);
      }
      else if (choice == 8) {
        System.out.println("Enter the number that you would like to find the cosine of.");
        double num1 = input.nextInt();
        double result = Math.cos(num1);
        System.out.println("Result: " + result);
      }
      else if (choice == 9) {
        System.out.println("Enter the number that you would liike to find the tangent of.");
        double num1 = input.nextInt();
        double result = Math.tan(num1);
        System.out.println("Result: " + result);
      }
      else if (choice == 10) {
        System.out.println("Enter the number that you would like to find the natural log of.");
        double num1 = input.nextInt();
        double result = Math.log(num1);
        System.out.println("Result: " + result);
      }
      else if (choice == 11) {
        System.out.println("Enter the number that you would like to multiply with the base e function, \nand the power that you want to raise e to.");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double result = num1 * (Math.exp(num2));
        System.out.println("Result: " + result);
      }
      else if (choice == 12) {
        System.out.println("Farewell");
      }
      else {
        System.out.println("That's not an option buddy");
      }
    }
  }
}