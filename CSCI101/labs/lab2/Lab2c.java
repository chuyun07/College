import java.util.Scanner;

class Lab2c{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <= 9999; i++){

			System.out.println("Enter an integer: ");
			int first = sc.nextInt();

			System.out.println("This is the entered Int: " + first);
		}
	}
}	
