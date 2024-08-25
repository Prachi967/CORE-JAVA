package Airthematic;
import java.util.*;
public class Main2 {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		System.out.println("Factorial of"+x+"is "+Math2.factorial(x));
		if(Math2.isStrong(x)==true)
		{
			System.out.println(x+" is a Strong number");
		}
		else
			System.out.println(x+" is not a Strong number");
	}

}
