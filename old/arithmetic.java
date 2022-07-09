import java.io.*;
import java.util.Scanner;
class arithmetic{
	public static void main(String[]deepa){
	
	Scanner s=new Scanner(System.in);
	
	while(true)
	{
		try
		{	
		  int a=0 ,b=0;
		  System.out.println("enter two value:");
		  a=s.nextInt();
		  b=s.nextInt();
		  System.out.println("enter the operation given 1-add 2-sub 3-mul 4-div:");
		  int option=0;
		  option=s.nextInt();

		  if(option==1)	
			 System.out.println("add:"+(a+b));
		
		  else if(option==2)
			System.out.println("sub:"+(a-b));
		
		  else if(option==4)
			System.out.println("div:"+(a/b));
		
		  else if(option==3)
			System.out.println("mul:"+(a*b));
		
		  else if(option==5)
			System.exit(0);
		  else
			System.out.println("you have entered wrong operator,so the program will restart:");
		}
		catch(Exception hb){
			System.out.println("you are given wrong input, so please try again:");			
			
			
			//System.exit(0);
		}
	}	
}
}