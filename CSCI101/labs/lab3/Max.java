import java.util.Scanner;
class Max{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter first int");
		int first = kb.nextInt();

		System.out.println("Enter second int");
		int second = kb.nextInt();
		
		if(first < second){

			System.out.println("Largest int = " + second);

		}
		else{
	
			System.out.println("Largest int = " + first);	
		}
	}
}
