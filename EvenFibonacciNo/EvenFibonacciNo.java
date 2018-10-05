// even fibonacci series
public class EvenFibonacciNo
{
	public static void main(String[] args)
	{
		long sum = 2;
		long prev = 1;
		long cur = 2;
		long next;
		while(cur <= 4000000)
		{
			next = cur + prev;
			prev = cur;
			cur = next;
			if(cur % 2 == 0)
				sum += cur;
		}

		System.out.println("Sum is: " + sum);
	}
}
