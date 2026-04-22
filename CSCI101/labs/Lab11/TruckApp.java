import java.util.*;
import java.io.*;
class TruckApp{
   public static void main(String[] args){
      PickupTruck truck1 = new PickupTruck("783934ACJJD", "Ford", "F-150");
      PickupTruck truck2 = new PickupTruck("HJH343255HJ", "Toyota", "Tacoma");
      
      printPickupTrucks(truck1);
      printPickupTrucks(truck2);
      PickupTruck[] t = new PickupTruck[2];
      t[0] = truck1;
      t[1] = truck2;
      
      writeTrucksToFile(t, "trucks.txt");
      printTrucks(getTrucksFromFile("trucks.txt"));
      }
      static void printPickupTrucks(PickupTruck t){
         System.out.println(t.toString());
      }
      static void printTrucks(PickupTruck[] t){
         for(int i = 0; i < t.length; i++){
            System.out.println(t[i].toString());
         }
      }
      static void writeTrucksToFile(PickupTruck[] t, String str){
         try{
            FileWriter fWriter = new FileWriter(str);
            for(int i = 0; i < t.length; i++){
               fWriter.write(t[i].toString() + "\n");
            }
            fWriter.close();
         }
         catch(IOException e){
            System.out.print(e.getMessage());
         }
      }
      static PickupTruck[] getTrucksFromFile(String str){
         PickupTruck[] t = new PickupTruck[2];
         try{
            Scanner sc = new Scanner(new File(str));
            sc.useDelimiter(",|\n");
            PickupTruck t1 = new PickupTruck(sc.next(), sc.next(), sc.next());
            PickupTruck t2 = new PickupTruck(sc.next(), sc.next(), sc.next());
            t[0] = t1;
            t[1] = t2;
            return t;
         }
         catch(FileNotFoundException e){
            System.out.println("File not Found");
            return t;
         }
         
      }
}