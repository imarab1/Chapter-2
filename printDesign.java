public class printDesign {//class
	public static void main (String args[]) {//main method
		printDesign();//prints method
	}

	public static void printDesign() {
		int b = 0;//Stored value - this sets how many dashes we get per line
		int g = 2;//Stored value - when we change this it prints the number that is g numbers apart, when it is stored as two we get 1 3 5 7 9 
		for (int i = 1; i <= 9; i+=g) {//
		
			for (int q = 0 ; q < 5 - b; q++) {//prints the spaces on the left side
				System.out.print("-");
			}
			for (int j = 1; j <= i; j++) {//prints the number
				System.out.print(i);
			}
			for (int q = 0 ; q < 5 - b; q++) {//prints the spaces on the right side
				System.out.print("-");
			}
		System.out.print(" " + "");//gives the spaces for stylistic purposes
		System.out.println();
		
		b++;//Increases b by one so we get one less dash each time we print
	}
	}
}
