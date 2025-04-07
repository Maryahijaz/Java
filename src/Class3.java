
import java.util.Scanner;

// Switch
//Note the // for note and the /**/ is for new code 


public class Class3 {
	public static void main(String args[]) {
	
		//Selection Statement` (Switch)
	Scanner in = new Scanner(System.in);
		System.out.print("Please enter day number : ");
		int day = in.nextInt();
		
		switch(day) {// we can use float or double type in it
		// Not: their is a different in a and A in  the value between () 
		// it can be 1*3+4 ....
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");
			break;
		case 6:// it can be 1+2 ...
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Is not in the option");
		
		}
	}
	/*
	 int x = 2;
	
	switch(x) {
		case 1:// the 1 is constant and it can be a constant character
			System.out.print("case #1");
			break;
			
		case 2:
			System.out.print("case #2");
			break;
		// if their is no break it will write all the next cases
		case 3:	
			System.out.print("case #3");
			break;
			
		default : // we use it if the x value is not in the cases like if the x is = 5
			System.out.print("The value is not in the options");
	}
	*/

		
	}
	

