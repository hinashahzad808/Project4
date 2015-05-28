import java.util.Scanner;


public class HowOldAreYou2 {
	public static void main(String[] args){
		  
		  Scanner input=new Scanner(System.in);
		  
		  System.out.print("Hey, Whats your name? (Sorry, I keep forgetting.)");
		  String name = input.next();
		  
		  System.out.print("OK, "+name+", how old are you?");
	        int age=input.nextInt();
	        
	        System.out.print("\n");
	          if(age<16){
	        	  System.out.println("You can't drive"+name+".");
	        }
	          if(age>=16){
	        	  System.out.println("You can drive but can't vote, "+name+".");
	        }
	          if(age>=18){
	        	  System.out.println("You can vote but can't rent a car, "+name+".");
	        }
	          if(age>=25){
	        	  System.out.println("You can do pretty much anything "+name+".");
	        }
	  }
}
