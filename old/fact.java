import java.io.*;
import java.util.*;
class fact{
	public static void main(String[]arguments){
		int f=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--){
		f=f*i;
		}
			System.out.println("factorial of "+n+ " is "+f);
	}
}