
import java.util.Scanner;
// user input
//Note: the //  for note and the /**/ is for new code 


public class Class1 {
	public static void main (String args[]) {
		
		int n,a,d;
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter the first number");
		n=input.nextInt();
		
		System.out.print("Enter the secound number");
		a=input.nextInt();
		
		System.out.print("Enter the thered number");
		d=input.nextInt();
		
		System.out.print("Your number is "+n+""+""+ a+""+ d );
	
	/*printf to make the syntax nice printf("Your number is %f",n,a,d)
	  char s=in.next();//it will give an error because the char can take one character 
		to fix it we use char s=in.next().charAt (0);
	*/
	
	
	}
	
}
