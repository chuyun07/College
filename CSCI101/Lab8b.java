import java.util.*;
class Lab8b{
   static void print(int arr[][]){
   
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
            System.out.print(arr[i][x] + " ");
         }
      }
      System.out.println();
      System.out.println("-");
   }
   static void populateFromKeyboard(int arr[][]){
   
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Enter integers equal to the length of the array");
      
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
            
            arr[i][x] = kb.nextInt();
         }
      }
      kb.close();
   }
   static int getMax(int arr[][]){
   
      int max = -99999;
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
      
            if(max <= arr[i][x]){
         
               max = arr[i][x];
            }
         }
      }
      return max;
   }
   static int getMin(int arr[][]){
   
      int min = 99999;
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
      
            if(min >= arr[i][x]){
         
               min = arr[i][x];
            }
         }
      }
      return min;
   }
   static double getMeanAverage(int[][] arr){
   
      double sum = 0.0;
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
      
            sum = sum + arr[i][x];
         }
      }
      return sum/arr.length;
   }
   public static void main(String[] args){
   
      int[][] arr = new int[3][3];
      
      populateFromKeyboard(arr);
      print(arr);
      System.out.println("Max: " + getMax(arr));
      System.out.println("Min: " + getMin(arr));
      System.out.println("Mean: " + getMeanAverage(arr));
   }
}