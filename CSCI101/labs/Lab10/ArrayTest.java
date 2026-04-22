import java.util.*;
class ArrayTest{
   public static void main(String[] args){
      int[] arr1 = new int[5];
      arr1 = IntArray.create(2, 4, 6, 8, 10);
      IntArray.print(arr1);
      System.out.println("Max: " + IntArray.max(arr1));
      System.out.println("Min: " + IntArray.min(arr1));
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter an integer");
      int a = kb.nextInt();
      if(IntArray.contains(arr1, a)){
         System.out.println("Contains");
      }
      else{
         System.out.println("Does not contain");
      }
      System.out.println("Enter another integer");
      a = kb.nextInt();
      System.out.println("Count: " + IntArray.count(arr1, a));
      int[] arr2 = new int[arr1.length];
      arr2 = IntArray.clone(arr1);
      IntArray.print(arr2);
      int[] arr3 = IntArray.union(arr1, arr2);
      int[] arr4 = IntArray.intersection(arr1, arr2);
      IntArray.print(arr4);
      int[] arr5 = IntArray.difference(arr1, arr2);
      IntArray.print(arr5);
   }
}