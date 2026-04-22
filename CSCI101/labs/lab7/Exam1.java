import java.util.*;
class Exam1{

	public static void main(String[] args){

		printGreeting("my friend");
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str = kb.next();
		String str1 = kb.next();
		boolean isTrue = sameLength(str, str1);
		
		if(isTrue){
		
			System.out.println("Same Lengths");
		}
		else{

			System.out.println("Different Lengths");
		}

		
		System.out.println("Enter three ints");
		int input1 = kb.nextInt();
		int input2 = kb.nextInt();
		int input3 = kb.nextInt();

		int p = product(input1, input2, input3);
		System.out.println("Product: " + p);
		boolean isOdd = bothOdd(input1, input2);

		if(isOdd){

			System.out.println("is both odd: True");
		}
		else{
	
			System.out.println("is both odd: False");
		}

		int zero = countGreaterThanZero(input1, input2, input3);
		System.out.println("Greater Than Zero: " + zero);	
	}
	
	static void printGreeting(String str){

		System.out.println("Hello " + str);
	}
	
	static boolean sameLength(String str, String str1){

		if(str.length() == str1.length()){

			return true;
		}
		return false;
	}
	
	static int product(int a, int b, int c){

		int p = a * b * c;
		return p;	
	}
	
	static boolean bothOdd(int a, int b){

		if(a % 2 > 0 && b % 2 > 0){

			return true;
		}
		return false;
	}
		
	static int countGreaterThanZero(int a, int b, int c){
		int counter = 0;
		int[] arr = new int[3];

		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
	
		for(int i = 0; i < arr.length; i++){

			if(arr[i] > 0){

				counter++;
			}
		}
		return counter;
	}
}
