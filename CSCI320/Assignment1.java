import java.util.*;
class Assignment1{
   public static void main(String args[]){
      Scanner kb = new Scanner(System.in);
      System.out.println("Please Enter 2 Numbers");
      int num1 = kb.nextInt();
      int num2 = kb.nextInt();
      int r = 0;
      
      while(num1 > 0 && num2 > 0){
         r = num2%num1;
         num2 = num1;
         num1 = r;
         System.out.println("Your GCD = " + num2);
      }
   }
}