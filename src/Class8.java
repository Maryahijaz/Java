
import java.util.Scanner;

//Nested loop

public class Class8 {
	public static void main(String[]args)
	{
		for (int i = 0; i <= 2; i++) {
			System.out.println("Outer loop"+i+"\n");
			
			for (int j = 0; j <= 1; j++) {
				System.out.println("Nested loop"+" i= "+i+" j= "+j);
				for (int k = 0; k <= 1; k++) {
					System.out.print("3'rd loop"+" i= "+i+" j= "+j+" k= "+k+"\n");
				}
			}
			System.out.println("");
		}
	}

}
