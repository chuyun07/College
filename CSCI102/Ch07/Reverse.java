import java.util.*;
class Reverse{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("How big of an array? ");
      int x = sc.nextInt();
      int[] arr = new int[x];
      System.out.println("What numbers do you want in the array? ");
      for(int i = 0; i < arr.length; i++){
         arr[i] = sc.nextInt();
      }
      int[] rev = new int[arr.length];
      for(int i =0; i < arr.length; i++){
            rev[x-1] = arr[i];
            x = x - 1;
      }
      for(int i = 0; i < rev.length; i++){
         System.out.print(rev[i] + " ");
      }
      System.out.println();
   }
}