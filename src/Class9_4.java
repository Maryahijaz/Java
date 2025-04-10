
//Recursion Method

// recursion is a process in which a method call itself continuously

public class Class9_4 {
	
	//when we add stop fun the call method will stop  
	
	static int stop=0;
	static void fun() {
		
		if(stop==2) {//base case
		return;
	  }
		stop++;
		System.out.println("Hi");
		fun();// it will call  itself again and again
		
	}
	
	static int fact(int n)
	{//5
		if(n==1|| n==0)
			return 1;
		else
			return n*fact(n-1);//5*fact(4) -> 4*fact(3) -> 3*fact(2) -> 2*fact(1) -> 1*1
							   //120 <- 5*24 <- 4*6 <- 3*2 <- 2*1 <- 1
	}
	
	static void num(int n) {
		if(n<1)
			return;
		else 
			System.out.println(n);
		num(n-1);
	}
	
	//Fibonacci series
	
	static int fib(int n)
	{
		if (n==0 || n==1)
			return n;
		else 
			return fib(n-1)+fib(n-2);
		
	}
	
	static int n1=0,n2=1,n3;
	static void printFib(int n)
	{
		if(n>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
			System.out.print(" "+n3);
			printFib (n-1);
			
		}
	}
	
	static int summetion(int n1,int n2)
	{
		if(n1==n2)
			return n1;
		else if (n1>n2)
			return n1 + summetion(n1-1,n2);
		
		else
			return n1 + summetion(n1+1,n2);
 	}
	
	public static void main(String []args)
	{
		fun();
		System.out.println("\nfact = "+fact(5)+"\n");
		num(4);
		System.out.println("\nFib = "+fib(6));
		System.out.print(n1+" "+n2);
		int num=6;
		printFib(num-2);
		System.out.println("\n\nSum ="+summetion(6,4));
		// we can do it by use sum = (upper - lower +1) *(lower + upper) /2;
	}

}