import java.util.*;
import java.io.*;
class MazeGenerator{
   private static Scanner kb = new Scanner(System.in);
   private static Cell[][] maze = null;
   
   static void printMenu(){
      System.out.print("[1]Load\n[2]New\n[3]Edit\n[4]Save\n[5]Exit\nChoose an option:");
   } 
   static void printMaze(){
      System.out.print(" ");
      for(int i = 0; i < maze.length; i++){
	 System.out.print(i); 
      }
      System.out.println();
      for(int i = 0; i < maze.length; i++){
	 System.out.print(i);
         for(int x = 0; x < maze[i].length; x++){
            System.out.print(maze[i][x]);	    
         }
         System.out.println();
      }
   }
   
   static void loadMaze(){
      System.out.println("Enter a file name");
      String str = kb.next();
      Scanner sc = null;
      try{
         sc = new Scanner(new File(str));
      }
      catch(FileNotFoundException e){
         System.out.println("File not found");
         return;
      }
      int row = sc.nextInt();
      int col = sc.nextInt();
      maze = new Cell[row][col];
      for(int i = 0; i < maze.length; i++){
         for(int x = 0; x < maze[i].length; x++){
            maze[i][x] = new Cell(sc.nextInt());
         }
      }
      printMaze();
   }
   static void printGlyphMenu(){
      System.out.print("Glyph Menu\n[1]\u2007[2]\u2588[3]\u2620[4]\u2654[5]Exit\nChoose a Character: ");
   }
   static void editMaze(){
      int input = 0;
      int row = 0;
      int col = 0;
      printGlyphMenu();
      do{
         Scanner kb1 = new Scanner(System.in);
         input = kb1.nextInt();
	 System.out.println("Enter 5 when done editing");
         switch(input){
            case 1: System.out.println("Enter a row and column number");
               row = kb1.nextInt();
               col = kb1.nextInt();
               maze[row][col] = new Cell(1);
               break;
            case 2: System.out.println("Enter a row and column number");
               row = kb1.nextInt();
               col = kb1.nextInt();
               maze[row][col] = new Cell(2);
               break;
            case 3: System.out.println("Enter a row and column number");
               row = kb1.nextInt();
               col = kb1.nextInt();
               maze[row][col] = new Cell(3);
               break;
            case 4: System.out.println("Enter a row and column number");
               row = kb1.nextInt();
               col = kb1.nextInt();
               maze[row][col] = new Cell(4);
               break;
         }
      }while(input < 5);
      printMaze();
   }
   static void saveMaze(){
      System.out.println("File Name: ");
      String str = kb.next();
      try{
         FileWriter fWriter = new FileWriter(str);
	 fWriter.write(maze.length + " " + maze[0].length + "\n");
         for(int i = 0; i < maze.length; i++){
            for(int x = 0; x < maze[i].length; x++){
               fWriter.write(maze[i][x].getCode() + " ");		               
            }
	    fWriter.write("\n");
         }
	 fWriter.close();
     }
      catch(IOException e){
         System.out.print(e.getMessage());
      }
   }
   static void createNewMaze(){
      System.out.println("Dimensions of the new maze?");
      int input = kb.nextInt();
      int input1 = kb.nextInt();
      maze = new Cell[input][input1];
   }
   public static void main(String[] args){
      int input = 0;
      do{
         Scanner kb2 = new Scanner(System.in);
         MazeGenerator.printMenu();
         input = kb2.nextInt();
         switch(input){
            case 1: loadMaze();
               break;
            case 2: createNewMaze();
               break;
            case 3: editMaze();
               break;
            case 4: saveMaze();
               break;
         }      
      }while(input < 5);
   }
}
