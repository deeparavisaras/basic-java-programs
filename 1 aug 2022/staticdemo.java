import java.io.*;
 class staticdemochild{
	static void func(){
	System.out.println("child");}
}
 class staticdemo {
	public static void main(String[]args){
	{System.out.println("main method");}
	staticdemochild a = new staticdemochild();
	staticdemochild.func();
	
}
}
	