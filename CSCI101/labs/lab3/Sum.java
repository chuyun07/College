import java.util.Scanner;
class Sum{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter First int");
		int first = kb.nextInt();

		System.out.println("Enter Second int");
		int second = kb.nextInt();
		
		int total = first + second;

		System.out.println("Sum is " + total);	
	}
}
