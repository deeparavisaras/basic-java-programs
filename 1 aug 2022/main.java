class headmaster{ //parent
	void func(){
		System.out.println("headmaster");
	}
}
class student{ //child
	
	//static object for parent class
	static headmaster staticobject=new headmaster();
	
	//static method
	static void method(){
		System.out.println("static");
	}
}
class mainclass{
	
	//main method
	public static void main(String[]arguments){
	System.out.println("main class");
	
	//static method/object can be accessed using class name
	//eg: <classname>.<static method>
	student.method();
	
	//static method/object can be accessed using class name
	//eg: <classname>.<static object>
	//calling the function in parent class using the static object
	//eg: <classname>.<static object>.methodname()
	student.staticobject.func();
	
}
}
	
		