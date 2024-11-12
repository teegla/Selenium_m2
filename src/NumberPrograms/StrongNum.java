package NumberPrograms;

import java.util.Scanner;

public class StrongNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		if(Strong(num))
		{
			System.out.println("Strong number");
			}
		else
			{
				System.out.println("not strong number");
				
			}
	}
	public static boolean Strong (int num)//
	{
		int num2=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;//num/=10
		}
		if(sum==num2)
		{
			return true;
		}
		return false;
	}
	public static int factorial(int num)
	{
		int fact=1;
		
		for(;num>0;num--)
		{
			fact=fact*num;
		}
		return fact;
		
	 }
}
	


