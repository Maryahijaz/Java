
import java.util.Scanner;

public class Loop_Example {
	public static void main(String []args) {
		
		//write a program to print numbers from 1 to 10
		
		/*1)
		for(int a=1; a<= 10; a++)
		{
			System.out.println(a);
		}
	    */
		
		/*int i =1;
		while(i<11)
		{
			System.out.println(i);
			i++;
		}
	   */
	
		/*int j =1;
		do {
			System.out.println(j);
			j++;
		}while(j !=11);
	    */
		
		//Write a program to calculate the sum of 10 floating point numbers using for loop
		
		/*float c =0;		
		for(float k=1; k<=10 ;k++ )
		{
			c+=k;
		}
		System.out.println("Sum"+c);
		*/
		
		//Write a program that asking the user to input a positive integer then print the multiplication table of that number
		
		/*int num;
		int i;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter an positive integer number");
		num = in.nextInt();
		for(i=0;i<101 && num >0 ; i++)
		{
				System.out.println(num*i);	
		}
	*/
		
		//Write a program to find the factorial value of any number entered through the user
		
		/*int n ,f=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		n = in.nextInt();
		
		for(int i=1; n>=i ;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial= "+f);	
		*/
		
		//write a program that enters 10 integer numbers from the user and then print the sum of the even and odd integers
		
		/*Scanner in = new Scanner (System.in);

		int num;
		int SumEven =0, SumOdd=0;
		int i=0;// used to make sure that the user entered 10 number 
		 
		while(i<10)
		{
			System.out.println("Enter integer nember: ");
			num= in.nextInt();
			
			if(num %2==0)
			{
				SumEven+=num;// every time the prossese end the value of number will be agrees (num = new num) 
			}
			
			else
				SumOdd+=num;
			i++;
		}
		
		System.out.println("Even sum = "+SumEven);
		System.out.println("Odd sum = "+SumOdd);
		*/
		
		//write a program that enters 10 integer numbers from the user and then print the number of the even and odd integers

		/*Scanner in = new Scanner (System.in);
		int num;
		int SumEven =0, SumOdd=0;
		int i=0;
		
		 
		while(i<10)
		{
			System.out.println("Enter integer nember: ");
			num= in.nextInt();
			
			if(num %2==0)
			{
				SumEven++;// every time the prossese end the value of SumEven will be increase 1 
			}
			
			else
				SumOdd++;
			i++;
		}
		
		System.out.println("Even sum = "+SumEven);
		System.out.println("Odd sum = "+SumOdd);
		*/
		
		//Write a program to calculate the sum of following series where n is input by user 
		// 1 + 1/2 + 1/3 + ..... + 1/n
		
		int n ;
		float c=0;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a nember: ");
		n = in.nextInt();
		
		for(int i=1; i<=n ;i++ )
		{
			c+=1.0/i;
		}
		System.out.println("Sum = "+c);
		
		in.close();
	}

}
