import java.util.Scanner;  // Import the Scanner class

public class JavaCalculator  {

  public static int add(int num1, int num2){
    return num1 + num2;
  }
  public static int subtract(int num1, int num2){
    return num1 - num2;
  }
  public static int multiply(int num1, int num2){
    return num1 * num2;
  }
  public static int divide(int num1, int num2){
    return num1 / num2;
  }
  public static int modulo(int num1, int num2){
    return num1 % num2;
  }
  public static int calculate(int num1, int num2, String choice){
    switch(choice){
      case "a":
        return add(num1,num2);
      case "b":
        return subtract(num1,num2);
      case "c":
        return multiply(num1,num2);
      case "d":
        return divide(num1,num2);
      default:
        System.out.println("Please enter a valid Choice!");
        return 0;
    }
    
  }
  
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    while (true) {
      System.out.println("Calculator");
      System.out.println("***If you fail to enter a correct choice, your answer is automaticlly 0!*** ");
      System.out.println("a) Add");
      System.out.println("b) Subtract");
      System.out.println("c) Multiply");
      System.out.println("d) divide");
      System.out.println("q) Quit");
      System.out.println("Select (a/b/c/d/q): ");

      String choice = myObj.nextLine().toLowerCase();  // Read user input for choice

      if (choice.equals("q")){
        System.out.println("Exiting calculator.");
          break; // Exit the loop and terminate the program
      }

      System.out.println("Please enter number1:");
      Integer num1 = myObj.nextInt();  // Read user input for num1


      System.out.println("Please enter number2:");
      Integer num2 = myObj.nextInt();  // Read user input for num2

      int result = calculate(num1,num2,choice);
      System.out.println("Your answer is: " + result);
    }
  
    myObj.close();
  }
        
}