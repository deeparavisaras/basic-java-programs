import java.io.*;
import java.util.*;
class months_and_days{
	public static void main(String[]arguments){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a=n/30;
		int b=n%30;
		System.out.println(n+" contains"+a+"months and"+b+"days");
	}
}