package MyMathematics;

public class MyIntegerMath {
	public static long factorial(int x)
	{
		long fact = 1;
		while(x>0)
		{
			fact *= x;
					x--;
		}
		return fact;
	}
	public static boolean isStrong(int x)
	{
		long sum = 0;
		while(x>0)
		{
			sum+=factorial(x%10);
			x/=10;
			return true;
		}
	  return false;
	}
	public static int CountDigits(int x)
	{
		int total = 0;
		while(x>0)
		{
			total++;
			x/=10;
		}
		return total;
	}
	public static boolean ArmStrong(int x)
	{
		int digit = CountDigits(x);
		int sum = 0;
		while(x>0)
		{
			sum +=Pow(x%10, digit);
			x/=10;
		}
		return (sum==x);
		return true;
	}
	return false;
	
}
