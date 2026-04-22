import java.util.*;
class InputMismatchException{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = 0;
      do{
         try{
            System.out.println("Please enter two integers");
            int one = sc.nextInt();
            int two = sc.nextInt();
            System.out.println("Sum: " + (one + two));
         }
         catch(Exception e){
            System.out.println("that's not a valid integer");
            break;
         }
      }while(x == 0);
   }
}