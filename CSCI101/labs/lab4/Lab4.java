import java.util.Scanner;
class Lab4{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an int");
		int input1 = kb.nextInt();
		
		int inputPlusOne = increment(input1);
		System.out.println("input plus one: " + inputPlusOne);

		System.out.println("Enter two ints");
		int input2 = kb.nextInt();
		int input3 = kb.nextInt();

		double meanAverage = average(input2, input3);
		System.out.println("mean average: " + meanAverage);

		System.out.println("Enter a String");
		String input4 = kb.next();
		char firstChar = getFirstChar(input4);
		System.out.println("first character: " + firstChar);

		System.out.println("Enter two Strings");
		String input5 = kb.next();
		String input6 = kb.next();
		boolean hasSameFirstChars = sameFirstChars(input5, input6);
		System.out.println("has same first chars: " + hasSameFirstChars);
		
		
		 		
	
	}

	static int increment(int x){
	
		x = x + 1;
		return x;
	}

	static double average(int x, int y){
	
		int sum = x + y;
		double a = sum/2.0;
		return a;
	}

	static char getFirstChar(String str){
	
		char first = str.charAt(0);
		return first;

	}
	
	static boolean sameFirstChars(String str1, String str2){

		char a = getFirstChar(str1);
		char b = getFirstChar(str2);
		int comp = Character.compare(a, b);
		if(comp > 0){
			return false;
		}
		else{
			return true;
		}
	}
	
		
}
