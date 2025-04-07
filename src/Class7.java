
import java.util.Scanner;

//Break-Continue(Unlabeled)
//Note: the //  for notes and the /**/ is for new code 

//Note: the break and the continue never work on only if.. condition

public class Class7 {
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		/*for (int i = 0,j =0; i < 10 & j<10; i++,j++) {
			if(i==7)
				break;// when the value of i came 4 it will finish the program
			
			else if(j==4)
			continue;
			
			System.out.println("i= "+i+"\tj= "+j);
		}
		*/
		
		System.out.println("Test yourself :");
		System.out.println("What is '5+1=/2*10' =? ");
		
		float userAnswer,theCorrectAnser=55;
		boolean questionAnswer=false;
		
		for(int i=1;i <=3; i++)
		{
			userAnswer= in.nextFloat();
			
			if(userAnswer == theCorrectAnser )
			{
				questionAnswer =true;
				break;
			}
			else if (userAnswer !=theCorrectAnser)
			{
				System.out.println("Do it agian "+(i+1)+": ");
				continue;// we use it to do not print Do it again after the 3 time 
			}
		}
		
		if(questionAnswer)
			System.out.printf("Correct Answer");
		else
			System.out.printf("Wrong Answer");
		
	}

}
