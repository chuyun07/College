import java.util.*;
class IntArray{
   static int[] create(int... num){
      int[] arr = num;
      return arr; 
   }
   static void print(int[] arr){
      for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
   static int max(int[] arr){
      int mx = arr[0];
      for(int i = 0; i < arr.length; i++){
         if(mx < arr[i]){
            mx = arr[i];
         }
      }
      return mx;
   }      
   static int min(int[] arr){
      int mn = arr[0];
      for(int i = 0; i < arr.length; i++){
         if(mn > arr[i]){
            mn = arr[i];
         }
      }
      return mn;
   }
   static boolean contains(int[] arr, int k){
      for(int i = 0; i < arr.length; i++){
         if(arr[i] == k){
            return true;
         }
      }
      return false;
   }
   static int count(int[] arr, int k){
      int counter = 0;
      for(int i = 0; i < arr.length; i++){
         if(arr[i] == k){
            counter++;
         }
      }
      return counter;
   }
   static int[] clone(int[] arr){
      int[] arr1 = new int[arr.length];
      for(int i = 0; i < arr.length; i++){
         arr1[i] = arr[i];
      }
      return arr1;
   }
   static int[] union(int[] arr, int[] arr1){
      int[] u = new int[arr.length + arr1.length];
      System.arraycopy(arr, 0, u, 0, arr.length);
      System.arraycopy(arr1, 0, u, arr.length, arr1.length);
      LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
      for(int i = 0; i < u.length; i++){
         set.add(u[i]);
      }
      System.out.print(set);
      System.out.println();
      return u;
   }
   static int[] intersection(int[] arr, int[] arr1){
      int[] inter = new int[arr.length + arr1.length];
      System.arraycopy(arr, 0, inter, 0, arr.length);
      System.arraycopy(arr1, 0, inter, arr.length, arr1.length);
      return inter;
   }
   static int[] difference(int[] arr, int[] arr1){
      return arr;
   }
}