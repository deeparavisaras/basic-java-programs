class bike{
	void run(){System.out.println("running");}
}
class splendor extends bike{
	void run()
	{System.out.println("running safely with 60km");}
	public static void main(String[]args){
		bike b = new splendor();
		b.run();
	}
}