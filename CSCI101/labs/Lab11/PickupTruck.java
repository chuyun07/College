import java.util.*;
class PickupTruck{
   private String vin = null;
   private String make = null;
   private String model = null;
   
   public PickupTruck(String id, String mk, String md){
      vin = id;
      make = mk;
      model = md;
   }
   public String getVin(){
      return vin;
   }
   public String getMake(){
      return make;
   }
   public String getModel(){
      return model;
   }
   public String toString(){
      return "" + vin + "," + make + "," + model;
   }
}