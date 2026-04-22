class Square extends GeometricObject implements Colorable{
   
   private double side = 0.0;
   
   public Square(){}
   
   public Square(double side){
      this.side = side;
   }
   
   public double getSide(){
      return side;
   }
   
   public void setSide(double x){
      side = x;
   }
   
   public void howToColor(){
      System.out.println("Color all four sides.");
   }
   
   public double getArea(){
      return side*side;
   }
   
   public double getPerimeter(){
      return side*4;
   }
}