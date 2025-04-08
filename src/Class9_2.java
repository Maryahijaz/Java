
import static java.lang.Math.abs;
import static java.lang.Math.*;

//BuildIn methods(search on google java number methods/ java string mehods...)

public class Class9_2 {
	
	// there is an abs fun. that return absolute values
	public static void main(String[]args)
	{
		System.out.println("abs= "+abs(-1.1));// it give the answer without - 
		System.out.println("ceil= "+Math.ceil(-1.1));// it give the answer in bigger integer 
		System.out.println("floor= "+floor(-1.1));// it give the answer in smaller integer 
		System.out.println("round= "+round(1.44));// it give the answer in bigger integer after 0.5
		System.out.println("round= "+round(1.5));
		System.out.println("sqrt= "+sqrt(9));// it give the sqrt
		System.out.println("power= "+Math.pow(2,5));// it give the power 
		System.out.println("random= "+random());// it give the answer between 0.0 and 1.0
		System.out.println("max= "+max(1,5));// it give the bigger answer  
		System.out.println("max= "+max(max(35,max(1,5)),25));// it give the bigger answer 
		System.out.println("min= "+min(1,5));// it give the smaller answer    
		System.out.println("Result= "+pow(sqrt(100),2));//we can do more than 1 fun. 

		
		double r= (random()*((10-1)+1))+1;// int r=(int) (random()*((10-1)+1))+1; because the random variable is double
		System.out.println("Random= "+r);// it did the math question and give a random number between to of answer 
		
	}

}
