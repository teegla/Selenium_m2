package NumberPrograms;
import java.util.Scanner;
public class demoo {
public static void main(String[]args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("entr a number");
	String str=scan.next();
 
}
public static void frequency(String str)
{
	String result=remDup(str);
	for(int i=0; i< result.length();i++)
	{
		int count=0;
		char ch1=result.charAt(i);
		for(int j=0; j< str.length();j++)
		{
			char ch2 = str.charAt(j);
			if(ch1==ch2)
			{
				count++;
				
			}
		}
	}
}
}
