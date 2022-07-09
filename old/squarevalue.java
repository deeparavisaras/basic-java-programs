import java.io.*;
import java.util.Scanner;
class squarevalue{
	public static int squarevalue(int n){
		for(int i=1;i<=n/2;i++){
		if(i*i==n){
		System.out.println("correct:"+i);
		return 0;
		}
		}
	System.out.println("incorrect");
	return 0;
	}
	public static void main(String[]args){
		int b;
		Scanner sc=new Scanner(System.in);
		 b=sc.nextInt();
		squarevalue(b);
		}
	}


		