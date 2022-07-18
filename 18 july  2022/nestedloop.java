import java.io.*;
import java.util.*;
class nestedloop{
	public static void main(String[]arguments){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for (int j=i;j<=n;j++){
			System.out.print("*");
		}
		System.out.print("\n");
		}
	}
}