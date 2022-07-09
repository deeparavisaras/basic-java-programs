import java.io.*;
import java.util.Scanner;
class checkoddeven{
	public static void main(String[]args){
	int  e, o;
	 e=0;
	 o=0;
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int x=1;x<=a;x++)
	{
	if(x%2==0)
	{
	e++;}
	else
	{
	o++;}
 	}
	System.out.println("value of e:"+e);
	System.out.println("value of o:"+o);
	}
}