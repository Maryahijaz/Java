
import java.util.Scanner;

// While loop
// Note the // for note and the /**/ is for new code


public class Class4 {
	public static void main (String [] args) {
		
    //Repetition control statement(Count controlled while loop)
		
	/*	int count =1;
	while(count <=5) {// inside the() will be boolean value 
			System.out.println("Hi"+ count);
		count++;// we add it to not make the project return for ever 
		 //the result of count is 12345 
	}
	*/
		
		 // we can write ++ in () like:
		// while (count++<=5)
	
	
		/*while(count++ <=5) {
			System.out.println("Hi"+ count);
			 //this given different result to count value
			 // and it will be 23456 
		}
		*/
	
	//Repetition control statement(Sentinel controlled while loop)
	
	/*char letter ='a';
	int c =0;
	Scanner in = new Scanner (System.in);
	System.out.println("Enter a latter  \n\n");
	System.out.println("Note: the q letter end the procces");
	while(letter !='q') {
		letter= in.next().charAt(0);
		c++;
		
	}
	System.out.println("Count = "+c);
	*/
		
	//Repetition control statement(Flag controlled while loop)
		
	/*	char letter ='a';
		int c =0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a latter  \n\n");
		System.out.println("Note: the q letter end the procces");
		boolean flag= true;
		while(flag)
		{
			letter=in.next().charAt(0);
			c++;
			if (letter =='q')
				flag=false;
		}
		System.out.println("Count = "+c);
	*/
		
		//Example....
		
		Scanner in = new Scanner(System.in);
		float sum=0;
		float grade=0;
		int count =0;
		
		
		while(grade!=-1)
		{
			System.out.println("Enter grade "+(count+1)+":");
			grade=in.nextFloat();
			
			if(grade !=-1)
			{
				sum+=grade;
				count++;
			}
		
		}	
		System.out.println("Avg ="+(int)(sum/count));//(int) is to make the result in integer
	}
}
