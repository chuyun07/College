import java.util.*;
class Lab6{

	public static void main(String[] args){

		double arr[] = new double[5];
		printArray(arr);
		System.out.println();
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 decimal values");
		
		for(int i = 0; i < arr.length; i++){

			arr[i] = kb.nextDouble();
		}

		printArray(arr);
		System.out.println();
		System.out.println("Let's get an element, enter a number 0-4");
		int position = kb.nextInt();
		double elm = elementAt(arr, position);
		System.out.println("Element found: " + elm);
		double largestValue = max(arr);
		System.out.println("Largest: " + largestValue);
		double mean = meanAverage(arr);
		System.out.println("Mean average: " + mean);
		int positiveCount = numPositive(arr);
		System.out.println("Positive count: " + positiveCount);
		System.out.println("Enter a decimal value");
		double threshold = kb.nextDouble();
		boolean atLeastOneFound = containsGreaterThan(arr, threshold);
		System.out.println("Found at least one greater value: " + atLeastOneFound);
		int greaterThanCount = numGreaterThan(arr, threshold);
		System.out.println("Greater than count: " + greaterThanCount);

	}
	
	static void printArray(double[] arr){

		for(int i = 0; i < arr.length; i++){

			System.out.print(arr[i] + " ");
		}
	}

	static double elementAt(double[] arr, int a){

		return arr[a];
	}
	
	static double max(double[] arr){

		double num = 0;
		for(int i = 0; i < arr.length; i++){

			if(arr[i] > num){
				
				num = arr[i];
			}
		}
		return num;
	}

	static double meanAverage(double[] arr){

		double total = 0.0;
		for(int i = 0; i < arr.length; i++){

			total = total + arr[i];
		}
		double average = total/arr.length;
		return average;
	}

	static int numPositive(double[] arr){

		int counter = 0;
		for(int i = 0; i < arr.length; i++){

			if(arr[i] > 0){

				counter++;
			}
		}
		return counter;
	}
	
	static boolean containsGreaterThan(double[] arr, double a){

		for(int i = 0; i < arr.length; i++){

			if(arr[i] > a){

				return true;
			}
		}
		return false;
	}

	static int numGreaterThan(double[] arr, double a){

		int counter = 0;
		for(int i = 0; i < arr.length; i++){

			if(arr[i] > a){

				counter++;
			}
		}
		return counter;
	}	
}
