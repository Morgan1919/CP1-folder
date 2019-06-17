import java.util.Scanner;
class Main {
  	public static void main(String[] args) {
  		//DO NOT EDIT LINES 1-15
  		Scanner keyboard = new Scanner(System.in);
  		
    	System.out.println("Number of ints: ");
    	int numOfInts = keyboard.nextInt();
    	
    	int[] ints = new int[numOfInts];
    	for(int i = 0; i < numOfInts; i++)
    	{
    		System.out.println("Enter an int: ");
    		ints[i] = keyboard.nextInt();
    	}

	int[][] scores = { {75, 88, 78, 86}, {95, 92, 89, 97}, {73, 89, 92, 91}, {83, 83, 	83, 84}, {86, 65, 83, 91} }; 

}
