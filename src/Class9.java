
import java.util.Scanner;

public class Class9 {
	public static void main(String[]args) {
		
		/* test:{//Block name
			
			if(5<6)
			 
				break test;
				
			System.out.println("1");
			System.out.println("2");
			
		}
		System.out.println("3");
		*/
		
		for(int row =1; row<=10; row++)
		{
			for(int column =1; column <=5; column++)
			{
				if(row ==5)
					break;//it will break ths 5'th row just
				System.out.println("the row: "+row+"* ");
				
			}
			System.out.println("");
		}
	}

}
