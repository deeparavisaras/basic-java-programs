abstract class shape{
	abstract void draw();
	void pencil(){
		System.out.println("i am pencil");
	}
}
class rectangle extends shape{
	void  draw()
	{System.out.println("drawing rectangle");}
    void pencil()
	{System.out.println("i am pencil from rectangle");}

}
class circle extends shape{
	void draw()
	{System.out.println("drawing circle");}
}
class testabstraction{
	public static void main(String args[]){
		shape s1 = new rectangle();
		s1.draw();
		s1.pencil();
		shape s2 = new circle();
		s2.draw();
		s2.pencil();
		
	}
}