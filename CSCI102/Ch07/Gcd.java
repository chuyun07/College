import java.util.*;
class Gcd{
   public static void main(String args[]){
      System.out.println("please enter 5 numbers");
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[5];
      for(int i = 0; i < arr.length; i++){
         arr[i] = sc.nextInt();
      }
      System.out.println(GCD(arr));
   }
   public static int fGCD(int a, int b){
      if(a == 0){
         return b;
      }
      return fGCD(b%a, a);
   }
   public static int GCD(int... numbers){
      int d = numbers[0];
      for(int i : numbers){
         d = fGCD(d, i);
         
         if(d == 1){
            return 1;
         }
      }
      return d;
   }
}