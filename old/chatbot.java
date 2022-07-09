import java.io.*;
import java.util.*;
class chatbot{
	chatbot(){
		System.out.println("Hi!I'm chatbot created by Suriya-ravi");
		Scanner sc=new Scanner(System.in);
		while(true){
			String input=sc.next();
			if(input.equals("exit")==true){
				System.out.println("Oh!It seems You have given exit command\nIs it true..confirm with True as 1 and False as 0");
				int exitval=sc.nextInt();
				if(1==exitval){
					System.out.println("Ok, meet you next time...\nCheers!! Have a nice Day!\nCredits--suriya-ravi");
					System.exit(0);
				}
				else if  (0==exitval) System.out.println("Kudos, I like you a lot...I'll continue chatting you");
			}
		}
	}
	
}
class controller{
	public static void errorfront(){
		try{
			new chatbot();
		}catch(Exception e){
			System.out.println("Sorry my Program crashed!!\nThere is some error in my program...\nso, I restarted my program.\n--credits--suriya-ravi!");
			errorback();
		}
	}
	public static void errorback(){
		try{
			new chatbot();
		}catch(Exception e){
			System.out.println("Sorry my Program crashed!!\nThere is some error in my program...\nso, I restarted my program.\n--credits--suriya-ravi!");
			errorfront();
		}
	}
	public static void main(String mep[]){
		errorfront();
	}
}
	