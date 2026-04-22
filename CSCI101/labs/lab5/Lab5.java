import java.util.Scanner;

class Lab5{

	public static void main(String[] args){

		int[] arr = new int[10];
		printArray(arr);
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 10 Ints");
		for(int i = 0; i < arr.length; i++){
			arr[i] = kb.nextInt();
		}
		printArray(arr);
		System.out.println("Let's get a value from the array.");
		System.out.println("Enter the index you wish to retrieve");
		int index = kb.nextInt();
		int elm = getElement(arr, index);
		System.out.println(elm);
		System.out.println("Let's change a value in the array");
		System.out.println("Enter the index you wish to change");
		int index1 = kb.nextInt();
		System.out.println("What value do you want to store instead?");
		int value = kb.nextInt();
		setElement(arr, index1, value);
		System.out.println("The updated array:");
		printArray(arr);
	}

	static void printArray(int[] arr){
	
		for(int i = 0; i < arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int getElement(int[] arr, int i){

		return arr[i];
	}

	static void setElement(int[] arr, int i, int v){

		arr[i] = v;
	}
}
