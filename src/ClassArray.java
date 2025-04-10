
import java.util.Scanner;

//One dimensional array

public class ClassArray {
	public static void main (String []args)
	{
		// array = 10,15,20,25,30
		int [] n = new int [5];
		n[2] = 20;
		n[4]=30;
		System.out.println(n[2]+" "+n[4]);
		
		double a [] = new double [5];
		System.out.println(a[3]);
		
		float [] c ;
		c = new float [5];
		
		boolean [] arr = new boolean[2];
		System.out.println(arr[1]);
		
		char [] g = new char [3];
		System.out.println(g[2]);
		
		String f [] =new String [5];
		System.out.println(f[1]);
		
		String k [] = new String[] {"M","d"};
		System.out.println(k[1]);
		for(String y:k)
		{
			System.out.print(y);
		}
		
		int x []= {2,5,8,7,6,12};		
		x[1]=14;
		for(int i=0; i<x.length; i++)
		{
			System.out.print(x[i]);
		}
		System.out.println("\nx1= "+x[1]);
		System.out.println(x.length);
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();// will be integer value
		int [] array = new int [size];
	}

}
  