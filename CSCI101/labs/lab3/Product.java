import java.util.Scanner;
class Product{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter first int");
		int first = kb.nextInt();

		System.out.println("Enter second int");
		int second = kb.nextInt();

		int p = first * second;

		System.out.println("Product = " + p);		

	}
}
