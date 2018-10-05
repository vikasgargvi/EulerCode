//

import java.util.*;

public class LargestPrimeFactor
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);

		long no;
		System.out.println("Enter Number: ");
		no = inp.nextLong();

		/*long sqt = (long)Math.sqrt(no);
		if(sqt % 2 == 0)
			sqt--;*/
			long max = 0;

		for(long i = 2; i <= no; i++)
		{
			while(no % i == 0)
			{
				no = no / i;
				max = i;
			}
		}

		System.out.println("Largest Prime Factor is " + max);
	}
}
