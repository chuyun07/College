import java.util.*;
class Rsorting{
   public static void main(String args[]){
      double arr[][] = new double[3][3];
      double num = 0.0;
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            num = Math.random();
            arr[i][j] = num;
         }
      }
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
      System.out.println();
      double arr1[][] = new double[3][3];
      arr1 = sortRows(arr);
      for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[i].length; j++){
            System.out.print(arr1[i][j] + " ");
         }
         System.out.println();
      }
   }
   public static double[][] sortRows(double[][]m){
      double temp = 0.0;
      for(int i = 0; i < m.length; i++){
         for(int j = 0; j < m[i].length; j++){
            for(int k = 0; k < m[i].length - j - 1; k++){
               if(m[i][k] > m[i][k+1]){
                  temp = m[i][k];
                  m[i][k] = m[i][k+1];
                  m[i][k+1] = temp;
               }
            }
         }
      }
      return m;
   }
}