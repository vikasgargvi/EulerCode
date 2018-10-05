//
import java.util.*;

public class NthPrime
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);

		System.out.println("Which Prime Number you want to get? ");
		int Nth = inp.nextInt();

		int n = 0;
		int number = 1;
		int flag;
		do{
			flag = 0;
			number++;
			for(int i = 2; i <= Math.sqrt(number); i++)
			{
				if(number % i == 0)
					flag = 1;
			}

			if(flag == 0)
				n++;

		}while(n != Nth);

		System.out.println(Nth + "th Prime number: " + number);
	}
}
