public class SumSquareDifference
{
	public int SumOfSq;
	public int SqOfSums;

	public SumSquareDifference()
	{
		this.SqOfSums = 0;
		this.SumOfSq = 0;
	}

	public int SumOfSquares(int x)
	{
		for(int i = 1; i <= x; i++)
		{
			this.SumOfSq += i * i;
		}
		return this.SumOfSq;
	}

	public int SquareOfSums(int x)
	{
		for(int i = 0; i <= x; i++)
		{
			this.SqOfSums += i;
		}

		return this.SqOfSums * this.SqOfSums;
	}

	public int difference(int a, int b)
	{
		if(a < b)
			return b - a;
		else
			return a - b;
	}
}