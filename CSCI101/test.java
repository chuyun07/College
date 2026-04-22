import java.util.*;

class test{

   public static void main(String[] args){
   
      Scanner kb = new Scanner(System.in);
      System.out.print("Number of indexes: ");
      int input = kb.nextInt();
      System.out.println();
      System.out.print("Enter Ints: ");
      int[] arr = new int[input];
      for(int i = 0; i < input; i++){
      
         arr[i] = kb.nextInt();
      }
      System.out.print("The sorted array from largest to smallest: ");
      sortArray(arr, "Big");
      System.out.println();
      System.out.print("The sorted array from smallest to largeset: ");
      sortArray(arr, "Small"); 
   
   }
   
   static void sortArray(int[] arr, String str){
      int b = 0;
      int s = 0;
      
      if(str.equals("Big") == true){
         for(int i = 0; i < arr.length - 1; i++){
      
            for(int x = 1; x < arr.length; x++){
         
               if(arr[i] < arr[i + x]){
               
                  s = arr[i];
                  arr[i] = arr[i + x];
                  arr[i + x] = arr[i];                 
               }
            }   
         }
         System.out.print(arr);
      }
      else{
      
         for(int i = 0; i < arr.length - 1; i++){
         
            for(int x = 1; x < arr.length; x++){
            
               if(arr[i] > arr[i + x]){
               
                  b = arr[i];
                  arr[i] = arr[i + x];
                  arr[i + x] = b;
               }
            }
         }
         System.out.print(arr);
      }
   
   }
}