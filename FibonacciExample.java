//author Imara Bhanji
public class FibonacciExample {

    public static void main(String[] args) {

        int f1 = 1, f2 = 1;// original first and second number
		int end = 12; //provides stopping number for loop
		
		
		for (int i = 1;i <= end; i++) { //loop - repeats the program 12 times
			
			System.out.print(f1); //prints first number
			System.out.print(" "); // prints an in between space
			
			int sum = f1 + f2; // sums the first and second number
           		f1 = f2; // first number becomes previous second number
           		f2 = sum; // second number becomes the sum 
			
			
		}
	}
}
  

