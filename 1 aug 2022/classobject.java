class class1{
	void func(){
	System.out.println("class1");}
}
class class2{
	void func(){
		System.out.println("class2");
	}
}
class classobject{
	static void method(){
		System.out.println("classobject");
	}
	public static void main(String[]args){
		
		System.out.println("main method");
		class1 object1 = new class1();
		object1.func();
		class2 object2 =new class2();
		object2.func();
	    method();
	}
}