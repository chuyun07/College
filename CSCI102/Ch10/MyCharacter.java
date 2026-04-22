import java.util.*;
class MyCharacter{
   private static char a = '0';
   
   MyCharacter(char a){
      this.a = a;
   }
   
   public static boolean compare(char x, char y){
      if(x == y){
         return true;
      }
      else{
         return false;
      }
   }
   
   public static char toLowerCase(char x){
      int ascii = (int) x;
      if(ascii <= 89 && ascii >= 65){
         char y = (char) (ascii + 32);
         return y;
      }
      else{
         return '0';
      }
   }
   
   public static char toUpperCase(char x){
      int ascii = (int) x;
      if(ascii >= 97 && ascii <= 122){
         char y = (char)(ascii -32);
         return y;
      } 
      else{
         return '0';
      }
   }
   
   public static boolean isLetter(char x){
      int ascii = (int) x;
      if((ascii >= 97 && ascii <= 122) || (ascii >= 65 && ascii <= 89)){
         return true;
      }
      else{
         return false;
      }
   }
   
   public boolean isDigit(char x){
      int ascii = (int) x;
      if(ascii >= 48 && ascii <= 57){
         return true;
      }
      else{
         return false;
      }
   }
   
   public static int valueOf(char x){
      int ascii = (int) x;
      return ascii;
   }
   
   public static String toString(){
      return "" + a;
   }
}