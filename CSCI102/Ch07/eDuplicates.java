import java.util.*;
class eDuplicates{
   public static void main(String args[]){
      System.out.println("Enter 10 numbers");
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[10];
      for(int i = 0; i < arr.length; i++){
         arr[i] = sc.nextInt();
      }
      int[] arr1 = eliminateDuplicates(arr);
      for(int i = 0; i < arr1.length; i++){
         System.out.print(arr1[i] + " ");
      }
      System.out.println();
   }
   public static int[] eliminateDuplicates(int[] list){
      int[] temp = new int[list.length];
      int j = 0;
      for(int i = 0; i < list.length; i++){
         boolean exists = false;
         for(int k = 0; k < i; k++){   
            if(list[i] == list[k]){
               exists = true;
            }
         }
         if(!exists){
            temp[j++] = list[i];
         }
      }
      int[] result = new int[j];
      for(int i = 0; i < j; i++){
         result[i] = temp[i];
      }
      
      return result;
   }
}