
import java.util.Scanner;

public class Class9_0 {
	public static void main(String[]args) {
		
		/* test:{//Block name
			
			if(5<6)
			 
				break test;
				
			System.out.println("1");
			System.out.println("2");
			
		}
		System.out.println("3");
		*/
		
		/*for(int row =1; row<=10; row++)
		{
			for(int column =1; column <=5; column++)
			{
				if(row ==5)
					break;//it will break ths 5'th row just
				System.out.println("the row: "+row+"* ");
				
			}
			System.out.println("");
		}
		*/
		
/*stop:{
		for(int row =1; row<=10; row++)
		{
			for(int column =1; column <=5; column++)
			{
				if(row ==5)
					break stop;//will break all block after 5'th row
				System.out.print(row+"* ");
				
			}
			System.out.println("");
		}
		}
*/
		
	nextRow:for(int row =1; row <= 5; row++)
	{
		System.out.println("");
		
		nextCol:for (int column =1; column <=10; column++)
		{
			if(column>row)
				continue nextRow;// it will never write the print out the nested for
			if (1<2)
		//break nextCol;// it will end all the code
			System.out.print("* ");
				
		}
System.out.print("/ ");
System.out.print("+ ");
	}
		
	}

}
