import java.util.*;
class Sort{
   public static <E extends Comparable <E>> void sort (ArrayList<E> list){
      Collections.sort(list);
      for(E element: list){
      System.out.print(element + " ");
      }
      System.out.println();
   }
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<>();
      System.out.println("Enter 10 Integers");
      for(int i = 0; i < 10; i++){
         list.add(sc.nextInt());
      }
      sort(list);
      
      ArrayList<String> lists =  new ArrayList<String>();
      System.out.println("Enter 10 Strings");
      for(int i = 0; i < 10; i++){
         lists.add(sc.next());
      }
      sort(lists);
   }
}