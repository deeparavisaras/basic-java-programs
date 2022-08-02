class bike{
	int speedlimit=90;
	void func(){
		System.out.println("bike");
	}
}
class poly extends bike{
	
	//data members cannot be overrided
	int speedlimit=190;
	
	//overriding the method of parent/bike class
	void func(){
		System.out.println("poly");
	}
	
	//main method/function
	public static void main(String[]args){
		bike object = new poly();
		object.func();
		
	}
}
