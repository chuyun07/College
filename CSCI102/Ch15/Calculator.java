import java.util.*;
class Calculator{
   public static void main(String[] args){
   
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter number 1: ");
      double input = sc.nextDouble();
      System.out.println("Enter number 2: ");
      double input2 = sc.nextDouble();
      System.out.println();
      int x = 0;
      System.out.println("Number 1: " + input + "\n" + "Number 2: " + input2);
      System.out.println();
      System.out.println("1. Add    2. Subtract    3. Multiply    4. Divide");
       int input3 = sc.nextInt();
       switch(input3){
         case 1:
            System.out.println("Results: " + (input+input2));
            break;
         case 2:
            System.out.println("Results: " + (input-input2));
            break;
         case 3:
            System.out.println("Results: " + (input*input2));
            break;
         case 4: 
            System.out.println("Results: " + (input/input2));
            break;
         default:
            System.out.println("Invalid Choice");
         }
          
   }
}