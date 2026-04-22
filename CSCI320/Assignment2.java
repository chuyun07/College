import java.util.*;
class Assignment2{
   public static void main(String args[]){
      Scanner kb = new Scanner(System.in);
      System.out.println("Please Enter 2 numbers: ");
      int m = kb.nextInt();
      int n = kb.nextInt();
      int t = 0;
      int check = 0;
      
      if(m>n){
         while(check == 0){
            if(t%n == 0){
               System.out.println("The GCD is " + t);
               check++;
            }
            else{
               t = t - 1;
            }
         }
      }
      System.out.println("This is the GCD: " + t);
   }
}