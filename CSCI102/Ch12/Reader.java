import java.util.*;
import java.io.*;
class Reader{
   public static void main(String[] args){
      System.out.println("Enter file name");
      Scanner sc = new Scanner(System.in);
      File file = new File(sc.next());
      int sum = 0;
      int count = 0;
      try{
         Scanner sc1 = new Scanner(file);
         while(sc1.hasNextLine()){
            int i = sc.nextInt();
            sum = sum + i;
            count++;
         }
         System.out.println("Total: " + sum);
         System.out.println("Average: " + (sum/count));
         sc.close();
      }
      catch(FileNotFoundException e){
         e.printStackTrace();
      }
        
   }
}