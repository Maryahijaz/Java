
import java.util.Scanner;

// if-else
//Note the //  for note and the /**/ is for new code 


public class Class2 {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);	 
		int num=0;
		System.out.print("Enter a number");
		num = in.nextInt();
		
		//Selection Statement (if-else if-else) 
		
		 if(num >50 && num <=100){
		  	 if(num >=90)
		  	    System.out.println("A");
		  	 else if(num >=80)
		  		System.out.println("B");
		  	 else if (num >=70)
		  		System.out.println("C");
		  	 else
		  		System.out.println("D");
		  }
		 else if (num > 100)
		  		System.out.println("Error");
		 else
			    System.out.println("Fail");
		 
			/*
			 IF condition not's 
			 we can do the mark problem in one line 
		 
			int r =(num >=90)?"A":(num >=80)?"B":(num >=70)?"C":(num >=60)?"D":(num > 100)?"Error": "Fail"
			System.out.println("R is = "+ r);
			
			
			if we have to know if is the type of r is String  we use instanceof String
			like : System.out.println(r instanceof String); 
			OR if the in is from Scanner class ..est 
				   System.out.println(in instanceof Scanner);
		  
			  
			  Not : the short if condition is ?(is it true) :(is it false)
			  like : int y=1;
			  		 int z = y==1? 2 : 5;(if the y value is =1 print the value of z 2 and if not print it 5)  
			   			 System.out.println(" Z value is  "+z);
			   			 
			   			 
			  if(number>0) {//10
				if (number %2==0) {
			    System.out.print("Even");
				System.out.println(" Positive number");
			}else
			{
				System.out.print("Odd");
				System.out.println(" Positive number");
			}
			
		  }
			else if(number %2 !=0) {
				System.out.print("Odd Negative number ");
			}
			
			else {
				System.out.println(" Even Negative number");		
			}
			
			
			Not: int x =(5>4); it given error because the data type wrong
			to fix it we use boolean
			*/
		 in.close();		 
	}
	
}
