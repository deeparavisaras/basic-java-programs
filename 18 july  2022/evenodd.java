import java.io.*;
import java.util.*;
class evenodd{
	public static void main(String[]args){
		System.out.print("even numbers are: \n");
		for(int i=1;i<=100;i++){
			if(i%2==0){
			System.out.print(i+" ");
			}
		}
		System.out.println("\nodd nubers are: ");
		for (int i=1;i<=100;i++){
			if(i%2!=0){
				System.out.print( i+" ");
			}
		}
	}
}