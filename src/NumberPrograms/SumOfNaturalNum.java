package NumberPrograms;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int num=s.nextInt();
		System.out.println(Sum_Of_naturalnumber(num));
	}
		public static int Sum_Of_naturalnumber(int num)
		    {	
			int sum=0;
			for (int i=1; i<=num; i++)
			{
				sum=sum+i;
				
			}
				return sum;
				
	}

}
