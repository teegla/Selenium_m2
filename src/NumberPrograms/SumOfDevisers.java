package NumberPrograms;

import java.util.Scanner;

public class SumOfDevisers {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a num");
		int num= scan.nextInt();
		System.out.println(sum_of_div(num));
		
	}
        public static int sum_of_div(int num)
        {
        	int sum=0;
        	for (int i=1; i<=num; i++)
        	{
        		if(num% i==0)
        		{
        			sum=sum+i;
        		}
        		
        		
        		}
        	return sum;
        	}
}

