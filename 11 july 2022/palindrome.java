import java.io.*;
import java.util.*;
class palindrome{
	public static void main(String argum[]){

	System.out.println("Enter a string/number:");
	Scanner s= new Scanner(System.in);

	String pal = s.next();
	StringBuilder sb = new StringBuilder(pal);
	String palrev = sb.reverse()+"";

	if(pal.equals(   palrev  )){
		System.out.println("palindrome");}
	else{
		System.out.println("not a palindrome");
	}
	
	}
}
