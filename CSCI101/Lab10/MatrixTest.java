import java.util.*;
class MatrixTest{
   public static void main(String[] args){
      int[] row1 = {1, 2, 3};
      int[] row2 = {-2, -1, -3};
      int[] row3 = {9, 8, 7};
      int[][] matrix1 = IntMatrix.create(row1, row2, row3);
      IntMatrix.print(matrix1);
      System.out.println("Max: " + IntMatrix.max(matrix1));
      System.out.println("Min: " + IntMatrix.min(matrix1));
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter an Integer");
      int a = kb.nextInt();
      if(IntMatrix.contains(matrix1, a)){
         System.out.println("Contains");
      }
      else{
         System.out.println("Does not contain");
      }
      System.out.println("Enter another Integer");
      a = kb.nextInt();
      System.out.println("Count: " + IntMatrix.count(matrix1, a));
      int[][] matrix2 = IntMatrix.clone(matrix1);
      IntMatrix.print(matrix2);
   }
}