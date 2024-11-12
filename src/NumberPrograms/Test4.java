package NumberPrograms;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int num=s.nextInt();
		if(palindrome(num))
		{
	
		 System.out.println("Palindrome");
		 }
		else
		{
			System.out.println("not palindrome");
		}
	}
	

 public static boolean palindrome(int num)
 {
        int temp=num;
        int rev=0;
        while(num!=0)
        {
        	int rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }
        
		if (temp==rev)
        {
        	return true;
        }
        return false;
 }


        	
       

	}


