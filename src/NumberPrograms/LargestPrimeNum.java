package NumberPrograms;

import java.util.Scanner;

public class LargestPrimeNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter lower range");
		int lower= scan.nextInt();
		System.out.println("enter higher range");
		int higher=scan.nextInt();
		for(int j=higher; j>=lower;j--)
		{
			if(isprime(j))
			{
				System.out.println(j);
				break;
				
			}
				
		}
      }
	public static boolean isprime(int num)
	{
			if (num==0||num==1)return false;
			int count=0;
			for(int i=1;i<=num; i++)
			{
				if(num% i==0)
				{
				   count ++;
				}
			}
				if(count==2)
				{
			     	return true;
				}
					return false;
								
	}
	}


