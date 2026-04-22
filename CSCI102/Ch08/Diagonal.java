import java.util.*;
class Diagonal{
   public static void main(String args[]){
      double[][] arr = new double[4][4];
      double num = 0.0;
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            num = Math.random()*100;
            arr[i][j] = num;
         }
      }
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(arr));
   }
   public static double sumMajorDiagonal(double[][] m){
      int count = 0;
      double sum = 0.0;
      while(count < m.length - 1){
         sum = m[count][count+1] + sum;
         count++;
      }
      return sum;
   }
}