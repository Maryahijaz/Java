
import java.util.Scanner;

public class MethodOrFunction_Example {

	//write a java method to find the smallest number among three number
	
	static int theSmallestNumber (int n1,int n2, int n3)
	{
		/*if(n1< n2 && n1< n3)
			return n1 ;
		else if (n2<n1 && n2<n3)
			return n2 ;
		else
		return n3 ;
		
		// we can use this but it's not dynamic
		  
		*/
		
		int minNumber=n1;
		
		if(minNumber>n2)
			minNumber=n2;
		
		else if(minNumber>n3)
			minNumber=n3;
		
		return minNumber;
		
	}
	
	//write a java method to compute the average of three numbers
	static float theAvgNum (float a, float b, float c)
	{
		float avg = (a+b+c)/3;
		return avg;
	}
	
	
	
	public static int sum(int ...n)// the ... is mean array ( it's take a variable number of arguments)
	{
		int s=0;
			for(int i:n)//cause we don't know how number are in n we but : and it's mean that the loop will work for n time 
			{
				s+=i;
			}
			return s ;
	}
	
	
	
	public static void main(String[]args)
	{
		
		Scanner in = new Scanner(System.in);
		int x,y,z;
		
	/*ystem.out.println("Enter the 1'th number: ");
		x= in.nextInt();
		
		System.out.println("Enter the 2'd number: ");
		y= in.nextInt();
		
		System.out.println("Enter the 3'rd number: ");
		z= in.nextInt();
	*/
		
		//System.out.println("The min number: "+theSmallestNumber(x,y,z));
		//System.out.println("The average number: "+theAvgNum(x,y,z));
		System.out.println("The Sum of number: "+sum(1,2,5,3,4,7));


	}
}
