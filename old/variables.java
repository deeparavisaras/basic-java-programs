import java.io.*;
import java.util.*;
class Student{
	String name;
	int age;
	int phone;
	}	
class variables{
	public static void main(String[]args){
	String a;
	Student b=new Student();
	Scanner sc=new Scanner(System.in);
	b.name=sc.next();
	b.age=sc.nextInt();
	b.phone=sc.nextInt(); 
	a=sc.next();
	System.out.println("given string:"+a);
	System.out.println("name: "+b.name+ " age: "+b.age+ " phone: "+b.phone);
	}
}