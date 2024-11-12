package NumberPrograms;

import java.util.Scanner;

public class Devicer 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
        div(num);
	
	}
			
public static void div(int num)
{
	for(int i=1; i<=num; i++)
	{
		if(num% i==0)
		{
			System.out.println(i);
		}
		
	
	}
}
}
