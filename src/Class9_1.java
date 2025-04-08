
//Method or Function 

public class Class9_1 {
	
	/*public static void fun()//void don't return any value
	{
		System.out.println("//");
		System.out.println("++");
	}
	
	public static void main(String []args){
		
		// we can't store the void funk. in a variable like int s = fun();
		fun();//to call the function we add static to the head of it
	}
	*/
	
	static int sumTwoNumbers(int n1,int n2) {
		
		int sum =n1+n2;
		// we can write the return like this return n1+n2
		return sum; //branching statement
	}
	
	public static void main(String []args){
		
		// we can write it like that 
		/* int s = sumTwoNumbers(5,5);
		    System.out.println("s= "+s);
		*/
		
		System.out.println(sumTwoNumbers(5,5));
		System.out.println(sumTwoNumbers(10,45));
	}

}


// not in void fun. we can see retune; but we should know that the program didn't read any thing after it
