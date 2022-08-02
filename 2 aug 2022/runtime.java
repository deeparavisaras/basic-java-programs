class hospital{
void run(){
	System.out.println("hospital");
}
}
class doctor extends hospital{
void run(){
	System.out.println("doctor");
}
}
class patient extends doctor{
void run(){
	System.out.println("patient");
}
}
class mainbranch{
	public static void main(String[]args){
		//System.out.println("mainbranch");
		
		hospital d1=new patient();
		d1.run();
	}
}