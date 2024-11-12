package NumberPrograms;

import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
		if(isperfect(num))
		{
			System.out.println("perfect number");
		}else
		{
			System.out.println("not perfect number");
			
		}

	}
      public static boolean isperfect(int num) {
		
    	  int sum=0;
    	  for(int i=1; i< num; i++)
    	  {
    		  if(num%i==0)
    		  {
    			  sum=sum +i;
    		  }
    	  }
    	     if(sum==num)
    	     {
    	    	 return true;
    	     }
    	     return false;
      }
    		  
}
      

