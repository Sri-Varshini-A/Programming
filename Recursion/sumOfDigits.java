package Recursion;
import java.util.*;
public class sumOfDigits {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int sum = findSum(num);
		while(sum>=10)
		{
			sum = findSum(sum);
		}
		System.out.println(sum);
	}
	public static int findSum(int num)
	{
		if(num==0)
		{
			return 0;
		}
		return (num%10)+findSum(num/10);
	}
}
