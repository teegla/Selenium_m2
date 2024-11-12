package patterns;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		int year=scan.nextInt();
		System.out.println("enter Month");
		int month=scan.nextInt();
		switch(month)
		{
		   
			case 1:
			case 3:
			case 7:
			case 8:
			case 10:	
			case 12:System.out.println("31days");
			break;
			
			case 4:
			case 6:
			case 9:
			case 11:System.out.println("30days");
			break;
			case 2:
			{
				if(year%400==0 || year%4==0 && year%100!=0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not aleap year");
				}
			
			}
			break;
			default :System.out.println("Invalid");
		}

	}

}
