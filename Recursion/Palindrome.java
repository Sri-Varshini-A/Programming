package Recursion;
import java.util.*;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if(num==reverse(num,0))
		{
			System.out.println("Palindrome!");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
	public static int reverse(int num, int rev)
	{
		if(num==0)
		{
			return rev;
		}
		rev = (rev*10)+(num%10);
		return reverse(num/10, rev);
	}
}
