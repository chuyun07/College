class Rectangle{
   private static double width = 1.0;
   private static double height = 1.0;
   
   public Rectangle(double w, double h){
      width = w;
      height = h;
   }
   
   public Rectangle(){
      this.width = 1.0;
      this.height = 1.0;
   }
   
   public double getWidth(){
      return width;
   }
   
   public double getHeight(){
      return height;
   }
   public double getArea(){
      return width*height;
   }
   
   public double getPerimeter(){
      return ((width*2) + (height*2));
   }
}