import java.util.Scanner;

class Cetvrta{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the coordinates");
		int num1 = kb.nextInt();
		int num2 = kb.nextInt();
		int num3 = kb.nextInt();
		int num4 = kb.nextInt();
		int num5 = kb.nextInt();
		int num6 = kb.nextInt();
		int num7 = 0;
		int num8 = 0;
		
		if(num1 == num3){
			num7 = num5;
		}
		else if(num1 == num5){
			num7 = num3;
		}
		else{
			num7 = num1;
		}
		if(num2 == num4){
			num8 = num6;
		}
		else if(num2 == num6){
			num8 = num4;
		}
		else{
			num8 = num2;
		}
		System.out.println(num7 + ", " + num8);
	}
}
