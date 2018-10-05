//largest palidrome

import java.util.*;

public class LargestPalidrome
{
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);

		int mul;
		int max = 0;

		for(int i = 999; i > 99; i--)
		{
			for(int j = i; j > 99; j--)
			{
				mul = i * j;
				String str = String.valueOf(mul);
				String reverse = "";
				for(int k = str.length() - 1; k >= 0; k--)
       				{
            				reverse = reverse + str.charAt(k);
        			}

				if(str.equals(reverse))
				{
					if(mul > max)
						max = mul;
				}
			}

		}
		System.out.println("Largest Palidrome: " + max);
	}
}
