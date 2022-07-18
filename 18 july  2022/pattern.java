import java.io.*;
import java.util.*;
class pattern{
	public static void main(String[]arguments){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(" ");
			}
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println("\n");
		}
		
		
	}
}