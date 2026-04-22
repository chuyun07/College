import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

class MazeGame {

	private static Cell[][] maze = null;
	private static int numRows = 0;
	private static int numCols = 0;

	private static Cell[][] board = null;
	private static Cell start = null;
	private static Cell end = null;

	private static int curRow = 0;
	private static int curCol = 0;

	private static int health = 100;
	private static int gold = 0;
	private static String message = "Good luck!";

	public static void main(String[] args) {
		loadMaze();
		initializeVisibleBoard();

		setStartAndEndCells();
		start.setGlyph(5);
		end.setGlyph(1);

		playGame();
	}

	static void playGame() {
		Scanner kb = new Scanner(System.in);
		char input = '?';
		do{
			clearScreen();
			System.out.println(message);
			printBoard();
			System.out.println("Health: " + health + "\nGold: " + gold);
			
			if(health <= 0){
				System.out.println("You died!");
				return;
			}
			else if(board[curRow][curCol].getGlyph() == end.getGlyph()){ 
				System.out.println("You WIN!");
				return;
			}
			System.out.println("Choose a direction");
			System.out.println("w(up), s(down), a(left), d(right), e(exit)");
			input = kb.next().charAt(0);
			if(validMove(input)){
				makeMove(input);
			}
			else{
				message = "Invalid move";
				health = health - 5;
			}				
		}while(input != 'e');
	}

	static void makeMove(char d) {
		int nextRow = curRow;
		int nextCol = curCol;

		if (d == 'w') {
			nextRow--;
		}
		else if (d == 's') {
			nextRow++;
		}
		else if (d == 'a') {
			nextCol--;
		}
		else if (d == 'd') {
			nextCol++;
		}

		if (maze[nextRow][nextCol].getCode() == 3) {
			message = "You've been bitten by a snake";
			board[nextRow][nextCol].setGlyph(maze[nextRow][nextCol].getCode());
			health -= 20;
		}
		else if (maze[nextRow][nextCol].getCode() == 4) {
			message = "You found the jewels!";	
			board[nextRow][nextCol].setGlyph(maze[nextRow][nextCol].getCode());
			gold += 20;
		}
		else {
			message = "Let's go!";
			board[curRow][curCol].setGlyph(maze[curRow][curCol].getCode());
			curRow = nextRow;
			curCol = nextCol;
			board[curRow][curCol].setGlyph(5);
		}
	}

	static boolean validMove(char d) {
		if(d == 'w' && curRow-1 > 0){
			if(maze[curRow-1][curCol].getGlyph() != '\u2588'){
				return true;
			}
			return false;
		}	
		else if(d == 's' && curRow+1 < numRows){
			if(maze[curRow+1][curCol].getGlyph() != '\u2588'){
				return true;
			}
			return false;
		}
		else if(d == 'a' && curCol-1 > 0){
			if(maze[curRow][curCol-1].getGlyph() != '\u2588'){
				return true;
			}
			return false;
		}
		else if(d == 'd' && curCol+1 < numCols){
			if(maze[curRow][curCol+1].getGlyph() != '\u2588'){
				return true;
			}
			return false;
		}
		return false;
	}

	static void setStartAndEndCells() {
		if (maze == null || maze.length == 0) {
			System.out.println("Background maze not set");
			System.exit(0);
		}

		boolean foundStart = false;
		boolean foundEnd = false;

		for(int i = numRows-1; i >= 0; i--) {
			if (maze[i][0].getGlyph() == '\u2007') {
				if (!foundStart) {
					start = board[i][0];
					curRow = i;
					curCol = 0;
					foundStart = true;
				}
				else if(!foundEnd){
					end = board[i][0];
					return;
				}
			}
		}
		for(int i = 0; i < numCols; i++) {
			if (maze[0][i].getGlyph() == '\u2007') {
				if (!foundStart) {
					start = board[0][i];
					curRow = 0;
					curCol = i;
					foundStart = true;
				}
				else if(!foundEnd){
					end = board[0][i];
					return;
				}
			}
		}
		for(int i = 0; i < numRows; i++) {
			if (maze[i][numCols-1].getGlyph() == '\u2007') {
				if (!foundStart) {
					start = board[i][numCols-1];
					curRow = i;
					curCol = numCols-1;
					foundStart = true;
				}
				else if(!foundEnd){
					end = board[i][numCols-1];
					return;
				}
			}
		}
		for(int i = numCols-1; i >= 0; i--) {
			if (maze[numRows-1][i].getGlyph() == '\u2007') {
				if (!foundStart) {
					start = board[numRows-1][i];
					curRow = numRows-1;
					curCol = i;
					foundStart = true;
				}
				else if(!foundEnd){
					end = board[numRows-1][i];
					return;
				}
			}
		}

	}

	static void initializeVisibleBoard() {
		if (maze == null || maze.length == 0) {
			System.out.println("Background maze not set");
			System.exit(0);
		}

		board = new Cell[numRows][numCols];

		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				board[i][j] = new Cell();
				board[i][j].toggleIsHidden();
			}
		}	
	}

	static void clearScreen() {  
    		System.out.print("\033[H\033[2J");  
    		System.out.flush();  
	}  

	static void printBoard() {
		if (board == null) {
			return;
		}

		for(int i = 0; i < board[0].length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j].toString() + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void loadMaze() {

		Scanner fin = null;

		try {
			fin = new Scanner(new File("maze1.txt"));
		}	
		catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}
     	

		numRows = fin.nextInt();
		numCols = fin.nextInt();

	 	maze = new Cell[numRows][numCols];

		for(int i = 0; i < maze.length; i++) {
			for(int j = 0; j < maze[i].length; j++) {
				maze[i][j] = new Cell(fin.nextInt());
			}
		}
	} 
}
