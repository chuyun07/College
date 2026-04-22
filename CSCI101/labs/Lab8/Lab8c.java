import java.util.*;
class Lab8c{
   static void initializePlayingField(char[][] arr){
   
      for(int i = 0; i < arr.length; i++){
      
         for(int x = 0; x < arr[i].length; x++){
         
            arr[i][x] = '=';
            arr[9][9] = 'X';
         }
      }     
   }
   static void printField(char[][] arr){
   
      for(int i = 0; i < arr.length; i++){
         System.out.println();
         for(int x = 0; x < arr[i].length; x++){
         
            System.out.print(arr[i][x] + " ");
         }
      }
   }
   static boolean isValidDirection(int row, int col, char direction){
      if(direction == 'd'){
      
         if(col+ 1 < 10){
            return true;
         }
         return false;
      }
      else if(direction == 'a'){
      
         if(col - 1 >= 0){
            return true;
         }
         return false;
      }
      else if(direction == 'w'){
      
         if(row - 1 >= 0){
            return true;
         }
         return false;
      }
      else{
         if(row + 1 < 10){
            return true;
         }
         return false;
      }
   }
   static void updateField(char[][] matrix, int row, int col, char direction){
      
         matrix[row][col] = '=';
         switch(direction){
            case 'd': matrix[row][col + 1] = 'X';
            break;
            case 'a': matrix[row][col - 1] = 'X';
            break;
            case 'w': matrix[row - 1][col] = 'X';
            break;
            case 's': matrix[row + 1][col] = 'X';
            break;  
         }
            
   }
   public static void main(String[] args){
      int playerRow = 9;
      int playerCol = 9;
      String input = null;
      char choice = '?';
      boolean isValid = false;
      
      Scanner kb = new Scanner(System.in);
      
      char[][] field = new char[10][10];
      initializePlayingField(field);
      do{
         printField(field);
         System.out.println();
         System.out.println("Enter direction: w(up), a(left), s(down), d(right), x(to exit)");
         input = kb.next();
         if(input.length() == 0){
            isValid = false;
         }
         else{
            choice = input.charAt(0);
            isValid = isValidDirection(playerRow, playerCol, choice);
         }
         if(isValid == true){
            
            updateField(field, playerRow, playerCol, choice);
            switch(choice){
               case 'd': playerCol++;
               break;
               case 'a': playerCol--;
               break;
               case 'w': playerRow--;
               break;
               case 's': playerRow++;
               break;
            
            }
         }
         else{
            System.out.println("Out of bounds, try again");
         }
      }while(choice !='x');
      System.out.print("\033[H\033[2j");
      System.out.flush();
   }
}