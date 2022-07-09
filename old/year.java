import java.io.*;
import java.util.*;
class year
{
	public static void main(String[]arguments)
	{
	Scanner sc=new Scanner(System.in);
	int y=sc.nextInt();
	if(y%400==0){
		System.out.println(y+" is a leap year");
	}
	else if(y%100!=0&&y%4==0){
		System.out.println(y+" is a leap year");
	}
	else{
		System.out.println(y+" is not a leap year");
	}
	}
}