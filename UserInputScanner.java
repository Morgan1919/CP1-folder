
import java.util.Scanner;

public class UserInputScanner{
	public static void main(String[] args){
		Scanner kin = new Scanner(System.in);

		System.out.print("What is your name? ");
		String fname = kin.nextLine();

		System.out.print("What is your last name? ");
		String lname = kin.nextLine();
		
		System.out.println("Hello " + fname + lname + ", it's nice to meet you!");

		System.out.print("What is your Street Address?" );
		String address = kin.nextLine();

		System.out.print("What is your City?" );
		String city = kin.nextLine();

		System.out.print("What is your State?" );
		String state = kin.nextLine();

		System.out.print("What is your Zip?" );
		String zip = kin.nextLine();

		System.out.println(fname +" "+ lname);

		System.out.println(address);

		System.out.println(city + " , " + state +"  "+ zip);

	}
}
