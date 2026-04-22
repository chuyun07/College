import java.lang.Math;
class Triangle extends GeometricObject{
   private double side1 = 1.0;
   private double side2 = 2.0;
   private double side3 = 3.0;
   
   public Triangle(){
      this.side1 = 1.0;
      this.side2 = 1.0;
      this.side3 = 1.0;
   }
   
   public Triangle(double side1, double side2, double side3){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   }
   
   public double getSide1(){
      return side1;
   }
   
   public void setSide1(double x){
      side1 = x;
   }
   
   public double getSide2(){
      return side2;
   }
   
   public void setSide2(double x){
      side2 = x;
   }
   
   public double getSide3(){
      return side3;
   }
   
   public void setSide3(double x){
      side3 = x;
   }
   
   public double getArea(){
      double x = (side1+side2+side3)/2;
      double y = (x * (x - side1) * (x - side2) * (x - side3));
      return Math.sqrt(y);
   }
   
   public double getPerimeter(){
      return (side1 + side2 +side3);
   }
   
   public String toString(){
      return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
   }
}