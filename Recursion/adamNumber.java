package Recursion;
import java.util.*;
public class adamNumber {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int f = isAdam(num);
		if(f==0)
		{
			System.out.println("Not adam number");
		}
		else
		{
			System.out.println("Adam number");
		}
	}
	public static int isAdam(int num)
	{
		int rev = reverse(num,0);
		System.out.println(rev);
		int revsq = rev*rev;
		int numsq = num*num;
		if(numsq == reverse(revsq,0))
		{
			return 1;
		}
		return 0;
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
