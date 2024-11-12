package NumberPrograms;

import java.util.Scanner;

public class CountOfDevicers {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println( num);
		int num_of_div=div(num);
	    System.out.println(num_of_div);
	} 
	
       public static int  div (int num)
       {
         int count=0;
         for(int i=1; i<=num;i++)
          {
	       if(num%i==0)
	        {
		    count++;
	        }
           }
         return count;
      }
}

