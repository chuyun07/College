import java.util.*;
class Test{
   public static void main(String[] args){
      Scanner kb = new Scanner(System.in);
      System.out.println("Please input three sides");
      Triangle a = new Triangle(kb.nextDouble(), kb.nextDouble(), kb.nextDouble());
      System.out.println("Please input a color");
      String color = kb.next();
      System.out.println("Is the triangle filled? (y/n)");
      boolean fill = false;
      char answer = kb.next().charAt(0);
      if(answer == 'y'){
         fill = true;
      }
      else{
         fill = false;
      }
      
      System.out.println(a.toString() + "\n" + "Area: " + a.getArea() + "\n" + "Perimeter: " + a.getPerimeter() + "\n" + "Color: " + color + "\n" + "Filled: " + fill); 
   }
}