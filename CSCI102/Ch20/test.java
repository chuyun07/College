import java.util.*;
import java.io.*;
public class test{
   public static void sortWords(String str){
      File file = new File(str);
      try{
         Scanner sc = new Scanner(file);
         while(sc.hasNext()){
            ArrayList<String> list = new ArrayList<>();
            list.add(sc.next());
            Collections.sort(list);
            for(String element: list){
               System.out.println(element + " ");
            }
            System.out.println();
         }
      }
      catch(FileNotFoundException e){
         System.out.println("File not found!");
      }
   }
      
   public static void arrayShuffle(Object[] arr){
      Random rand = new Random();
      for(int i = 0; i < arr.length - 1; i++){
         int index = rand.nextInt(i+1);
         Object g = arr[index];
         arr[index] = arr[i];
         arr[i] = g;
      }
   }
   
   public static void listDataAdder(Object[] arr, LinkedList<Object> list){
      ListIterator<Object> it = list.listIterator();
      for(Object e: arr){
         it.next();
         it.set(e);
      }
   }
   
   public static void bubbleSort(int[] arr){
      int temp;
      boolean swapped;
      for(int i =0; i < arr.length - 1; i++){
         swapped = false;
         for(int j = 0; j < arr.length - 1; j++){
            temp = arr[j];
            arr[j] = arr[j++];
            arr[j++] = temp;
            swapped = true;
         }
         if(swapped == false){
            break;
         }
      }
   }
      
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      LinkedList<Object> list = new LinkedList<Object>();
            
      System.out.print("Please enter File name: ");
      String str = sc.next();
      
      sortWords(str);
      
      System.out.println("Please enter five numbers");
      
      for(int i = 0; i < 5; i++){
         list.add(sc.nextInt());
      }
      
      System.out.print("this is the original list: ");
      System.out.println(list);
      
      Object[] array = list.toArray();
      arrayShuffle(array);
      listDataAdder(array, list);
      System.out.println("after shuffle: " + list.toString());
      System.out.println();
      
      int[] arr = new int[array.length];
      
      for(int i = 0; i < arr.length; i++){
         arr[i] = (int)(array[i]);
      }
      
      bubbleSort(arr);
      
      System.out.print("this is the sorted list: ");
      for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i] + ", ");
      }
      System.out.println();
      
      int[] reversedArr = new int[arr.length];
      for(int i = 0; i < arr.length; i++){
         reversedArr[i] = arr[arr.length- i - 1];
      }
      
      System.out.print("Reversed Array: ");
      for(int i : reversedArr){
         System.out.print(i + ", ");
      }
      System.out.println();
   }
}
