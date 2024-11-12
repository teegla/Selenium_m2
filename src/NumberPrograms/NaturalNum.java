package NumberPrograms;

import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
	    int num=scan.nextInt();
	    print(num);

	}
	public static void print(int num)
	{
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}

}
