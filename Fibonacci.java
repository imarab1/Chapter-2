//author Imara Bhanji
public class Fibonacci { //class
	
	public static void main (String[] args) { //method
		
		int f1 = 1; // original first number
		int f2 = 1; // original second number
		
		
		
		for (int i = 1; i <= 12; ++i){ //for loop repeats twelve times
			
			System.out.print(f1); //prints the first number
			System.out.print(" "); //prints space for stylistic changes
			
			int f3 = f1 + f2; //Add the first number and the second number
           		f1 = f2; // First number becomes the previous second number
            		f2 = f3; // Second number becomes the sum of the previous first and second number
		
			
			
		}
	}
}

