import java.util.*;
class GCD{
   public void recursion(){
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter two integers");
      int one = kb.nextInt();
      int two = kb.nextInt();
      if(one%two == 0){
         System.out.println("GCD: " + two);
      }
      else{
         recursion();
      }
   }
   
   public static void reverseDisplay(int value){
      int reverse = 0;
      while(value != 0){
         reverse = reverse * 10 + value % 10;
         value/=10;
      }
      System.out.println(reverse);
   }  
   
   public static String dec2Bin(int value){
      String binaryString = Integer.toBinaryString(value);
      return binaryString;
   }
}