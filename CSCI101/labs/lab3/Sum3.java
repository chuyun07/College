import java.util.Scanner;
class Sum3{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter First int");
		int first = kb.nextInt();

		System.out.println("Enter Second int");
		int second = kb.nextInt();

		
		System.out.println("Enter Third int");
		int third = kb.nextInt();
		
		int total = first + second + third;

		System.out.println("Sum is " + total);	
	}
}
