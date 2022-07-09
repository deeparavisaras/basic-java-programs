import java.io.*;
import java.util.*;
class fibonacci{
	
public static void main(String[]arguments){
	int n;
	int x=0,y=1,temp=1;
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println(x+"\n"+y);
	while(x<=n){
		x=x+y;
		y=temp;
		temp=x;
		System.out.println(x);
	}
	
	
}
}