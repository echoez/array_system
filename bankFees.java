import java.util.*;

public class bankFees
{
	public static void main(String[] args)
	{
		System.out.print("Please enter the number of checks: ");
		Scanner keyboard=new Scanner(System.in);
		int numOfChecks=keyboard.nextInt();
		double baseFee=10;
		double checkFee=0;
		
		if(numOfChecks<0)
		{
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		if(numOfChecks<20)
			checkFee=numOfChecks*0.10;
		else if( numOfChecks>=20 && numOfChecks<40)
			checkFee=numOfChecks*0.08;
		else if(numOfChecks>=40 && numOfChecks<60)
			checkFee=numOfChecks*0.06;
		else
			checkFee=numOfChecks*0.04;
			
	  System.out.println("The service fee is "+ (baseFee+checkFee) +".");
  }
}
				
	