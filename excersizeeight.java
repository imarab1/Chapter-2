public class excersizeeight { //class
	public static void main(String[] args) { //method
		int end = 5; //give us our end number I put it outside so it was easier to change
		
		for (int i = 1; i <= end; i++) {//first loop - loops five times
			for(int j = 1; j <= i; j++) {// loops each number that amount of times
				System.out.print(i); //prints loops
			}
			System.out.println();//provides spaces for stylistic changes
		}
	}
}

