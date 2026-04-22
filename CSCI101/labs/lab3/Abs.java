import java.util.Scanner;
class Abs{

	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter an int");
		int num = kb.nextInt();
		
		if(num < 0){

			int abNum = num * -1;
			System.out.println("Absolute value = " + abNum);
		}
		else{
		
			System.out.println("Absolute value = " + num);
		}
		
	}
}
