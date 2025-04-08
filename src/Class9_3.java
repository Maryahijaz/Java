
//Overloading method

public class Class9_3 {
	static int sum(int n1, int n2)
	{
		return n1+n2;
	}
	
	static float sum(float n1, float n2)//overloading because the 2 fun. have the same name
	{
		return n1+n2;
	}
	
	static float sum(int n1, float n2)//it will give error if the variable of n2 is int
	{
		return n1+n2;
	}
	
	static float sum(int n1, float n2,int n3)
	{
		return n1+n2+n3;
	}
	
	static void fun() {
		System.out.print("fun");
	}
	
	static void fun(int x) {
		fun();
		System.out.println(" x= "+x);
	}
	
	public static void main(int num) {
		System.out.println(num);
	}
	
	public static void main(String[]args)
	{
		fun(15);
		main(500);
		System.out.println("sum"+sum(10.5f,4));
		System.out.println("sum"+sum(4,10.5f,5));
		
	}

}
