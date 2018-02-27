import java.util.*;

public class SmallestMultiple
{
	public static void main(String[] args)
	{
		int[] fac = new int[20];
		int count = 0; 

		for(int i = 2; i <= 20; i++)
		{
			int x = i;
		
			for(int j = 0; j < count; j++)
			{
				if(x % fac[j] == 0)
					x =  x / fac[j];
			}
			fac[count++] = x;
			System.out.println("x: " + x);
		}

		int mul = 1;
		for(int i = 0; i < count; i++)
			mul *= fac[i];


		System.out.println("Smallest Multiple: " + mul);
	}
}