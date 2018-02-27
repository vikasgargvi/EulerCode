public class SumSquareDifferenceTest
{
	public static void main(String[] args)
	{
		SumSquareDifference s = new SumSquareDifference();

		int a = s.SumOfSquares(100);
		System.out.println("a: " + a);
		int b = s.SquareOfSums(100);
		System.out.println("b " +b);
		System.out.println("dff: " + s.difference(a, b));
	}
}