package NumberPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num =scan.nextInt();
		System.out.println(Factorial(num));
	
	

	}
     public static int Factorial (int num)
     {
    	 int Fact =1;
    	 for(; num>0; num--)
    	 {
    		 Fact=Fact*num;
    	 }
    	 return Fact;//120
     }


    	 
     }

