public class Testing{
   public static void main(String[] args){
      GeometricObject[] shapes = generateShapesArray(5);
      displayShapeInfo(shapes);
   }
   
   private static void displayShapeInfo(GeometricObject[] shapes){
      for(GeometricObject shape : shapes){
         System.out.println(shape.getClass() + "\n Area: " + shape.getArea());
         if(shape instanceof Colorable){
            System.out.print(" ");
            ((Colorable)shape).howToColor();
         }
      }
   }
   
   private static GeometricObject[] generateShapesArray(int size){
      GeometricObject[] shapes = new GeometricObject[size];
      for(int i = 0; i < shapes.length; i++){
            shapes[i] = new Square(i + 1);
      }
      return shapes;
   }
}