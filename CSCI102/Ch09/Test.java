import java.util.*;
class Test{
   public static void main(String args[]){
   
      Rectangle x = new Rectangle(4.0, 40.0);  
      System.out.println("Rectangle a" + "\n" + "Width, Height: " + x.getWidth() + ", " + x.getHeight() + "\n" + "Area: " + x.getArea() + "\n" + "Perimeter: " + x.getPerimeter());
      
      Rectangle y = new Rectangle(3.5, 35.9); 
      System.out.println("Rectangle b" + "\n" + "Width, Height: " + y.getWidth() + ", " + y.getHeight() + "\n" + "Area: " + y.getArea() + "\n" + "Perimeter: " + y.getPerimeter());
   }
}