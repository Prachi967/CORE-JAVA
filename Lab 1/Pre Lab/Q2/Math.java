package Airthematic;
import java.util.*;
public class Math {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact+=i;
		}
		System.out.println("Factorial of "+n+"="+fact);
	}

}
