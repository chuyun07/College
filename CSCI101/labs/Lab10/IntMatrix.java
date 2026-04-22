import java.util.*;
class IntMatrix{
   static int[][] create(int[]... num){
      return num;
   }
   static void print(int[][] arr){
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
            System.out.print(arr[i][x] + " ");
         }
         System.out.println();
      }
   }
   static int max(int[][] arr){
      int m = arr[0][0];
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
            if(arr[i][x] < m){
               m = arr[i][x];
            }
         }
      }
      return m;
   }
   static int min(int[][] arr){
      int mn = arr[0][0];
      for(int i = 0; i < arr.length; i++){
         for(int x = 0; x < arr[i].length; x++){
            if(arr[i][x] > mn){
               mn = arr[i][x];
            }
         }
      }
      return mn;
   }
   static boolean contains(int[][] matrix, int k){
      for(int i = 0; i < matrix.length; i++){
         for(int x = 0; x < matrix[i].length; x++){
            if(matrix[i][x] == k){
               return true;
            }
         }
      }
      return false;
   }
   static int count(int[][] matrix, int k){
      int count = 0;
      for(int i = 0; i < matrix.length; i++){
         for(int x = 0; x < matrix[i].length; x++){
            if(matrix[i][x] == k){
               count++;
            }
         }
      }
      return count;
   }
   static int[][] clone(int[][] arr){
      int[][] arr1 = new int[arr.length][];
      for(int i = 0; i < arr.length; i++){
         int[] r = arr[i];
         int[] newR = new int[r.length];
         for(int x = 0; x < r.length; x++){
            newR[x] = r[x];
         }
         arr1[i] = newR;
      }
      return arr1;
   }   
}