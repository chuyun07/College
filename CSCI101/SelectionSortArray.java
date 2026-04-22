import java.util.*;
import java.util.ArrayList;
public class SelectionSortArray{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("How many numbers in the array?");
      int num = sc.nextInt();
      ArrayList<Double> al = new ArrayList<Double>(num);
      for(int z=0; z<num; z++)
	   {
         al.add((Math.random()*2000)/100.0);
      }
      for(int z=0; z<num; z++)
      {
         double x = al.get(z);
         System.out.println(x);
      }
      selection(al);
      for(double i : al)			//use a for-each loop
      {
         System.out.println(i + ", ");
      }
         
   }
   public static void selection(ArrayList<Double> arr)
   {
      for(int z=arr.size()-1; z>=0; z--)
      {
         int maxIndex = findMax(arr, z);
         swap(arr, z, maxIndex);
      }
   }
   //findMax method which inclusively searches indexes [0,maxIx]
   public static int findMax(ArrayList<Double> arr, int maxIx)
   {
      int ix=0;   //assume the max is in index 0
      for(int z=0; z<=maxIx; z++)
      {
         if(arr.get(z) > arr.get(ix))
            ix=z;
      }
      return ix;
   }
   public static void swap(ArrayList<Double> arr, int ix1, int ix2)
   {
      double tmp = arr.get(ix1);
      arr.set( ix1, arr.get(ix2) );
      arr.set(ix2, tmp);
   }
}
