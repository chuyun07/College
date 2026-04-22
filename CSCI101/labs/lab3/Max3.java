
import java.util.Scanner;
class Max3{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter first int");
		int first = kb.nextInt();

		System.out.println("Enter second int");
		int second = kb.nextInt();
		
		System.out.println("Enter third int");
		int third = kb.nextInt();
		
		if(first >= second && first >= third){

			System.out.println("Largest int = " + first);

		}
		else if(second >= first && second >= third){
	
			System.out.println("Largest int = " + second);	
		}
		else{
			System.out.println("Largest int = " + third);
		}
	}
}
