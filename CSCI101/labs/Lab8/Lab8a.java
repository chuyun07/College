import java.util.*;
class Lab8a{
	static void print(int arr[]){
		for(int i = 0; i < arr.length; i++){

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-");
	}
	static void populateFromKeyboard(int arr[]){

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter int equal to the length of the array");
		for(int i = 0; i < arr.length; i++){

			arr[i] = kb.nextInt();
		}
		kb.close();
	}
	static int getMax(int arr[]){

		int max = -999999;
		for(int i = 0; i < arr.length; i++){

			if(max <= arr[i]){

				max = arr[i];
			}
		}
		return max;
	}
	static int getMin(int arr[]){

		int min = 999999;
		for(int i = 0; i < arr.length; i++){

			if(min >= arr[i]){
				
				min = arr[i];
			}
		}
		return min;
	}
	static double getMeanAverage(int[] arr){

		double sum = 0.0;
		for(int i = 0; i < arr.length; i++){
			
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	public static void main(String[] args){

		int[] arr = new int[5];
		
		populateFromKeyboard(arr);
		print(arr);
		System.out.println("Max: " + getMax(arr));
		System.out.println("Min: " + getMin(arr));
		System.out.println("Mean: " + getMeanAverage(arr));
	}
	
}
