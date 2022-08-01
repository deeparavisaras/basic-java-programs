class headmaster{
	void func(){
		System.out.println("headmaster");
	}
}
class student{
	static headmaster staticobject=new headmaster();
	String name;
	static void method(){
		System.out.println("static");
	}
}
class mainclass{
	public static void main(String[]arguments){
	System.out.println("main class");
	
	student.staticobject.func();
	
	
	student.method();
}
}
	
		