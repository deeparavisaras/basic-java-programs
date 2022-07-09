import java.io.*;
class add{
	public static int demo(){
		System.out.println("welcome:");
		return 2;
	}
	public static char world(char d){
		return d;
	}
	public static void main(String[]args){
		demo();
		world('f');
		System.out.println(world('g') );
	}
}