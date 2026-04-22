import java.util.*;
import java.lang.*;
class ArrayIndexOutOfBoundsException{
   public static void main(String[] args){
      int[] arr = new int[100];
      for(int i = 0; i < arr.length; i++){
         arr[i] = (int)(Math.random()*100);
      }
      
      Scanner sc = new Scanner(System.in);
      System.out.println("enter an index of the array");
      int input = sc.nextInt();
      if(input >= 0 && input <= 100){
         System.out.println(arr[input]);
      }      
      else{
         System.out.println("not valid");
      }
     
   }
}