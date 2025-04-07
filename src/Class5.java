
import java.util.Scanner;

//Do-While loop
//Note the // for note and the /**/ is for new code 

public class Class5 {
	public static void main (String [] args) {
		/*int c =0;
		do {// the code run with out condition
			
			System.out.println("Java");
			c++;// add 1 to c value
			
		  }while(c<5);// it will cheek if the c is < than 5
		*/
		// if it's < 5 will do the do condition again
		
		
		/* while (c==-1);// it will cheek if the condition right
		 because of c++ the value will  never be -1 and the condition will stop
	    */
		
		
	/*	 Scanner in = new Scanner (System.in);
		char letter;
		int count =0;
		
		do {
			System.out.println("Enter a letter");
			letter= in.next().charAt(0);
			//(Or) if(letter !=q)
			count++;
		}while (letter != 'q');
		
		System.out.println("Count number = "+ (count-1));//this
	 */
		Scanner in = new Scanner (System.in);
		int num1,num2;
		char c;
		char d ='f' ;
		do {
			
			System.out.println("Enter the first number");
			num1 = in.nextInt();
			System.out.println("Enter the secound number");
			num2 = in.nextInt();
			
			System.out.println("Enter ont of these  operators (*) or (/) or (+) or (-) ");
			System.out.println("Or enter any key to exit");
			
			c = in.next().charAt(0);
			switch (c) {
			
			case '*' :
				 System.out.println("Result\t"+(num1* num2));
				 break;
			
			case '/' :
				 System.out.println("Result\t"+ (num1/ num2));
				 break;	 
			
			case '+' :
				 System.out.println("Result\t"+ (num1+ num2));
				 break;	 
				 
			case '-' :
				 System.out.println("Result\t" + (num1- num2));
				 break;	
				 
			 default:
                 System.out.println("Exiting the program.");
                 break;		
			}
			
		}while(c == '*' || c== '/' || c== '+' ||c== '-' && c!=d);
		
	}
}
