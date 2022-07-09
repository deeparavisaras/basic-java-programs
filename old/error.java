import java.io.*;
import java.util.Scanner;
class error{
	public static void main(String[]args){
	int a;
	Scanner s=new Scanner(System.in);
	try
	{
	 a=s.nextInt();
	}
	catch(Exception e)
	{
	System.out.println("exception arrived:"+e+"\nyou have entered wrongly\nplease enter a integer:");
	}
	}
}