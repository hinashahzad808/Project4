import java.util.Scanner;


public class ALittleQuiz {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Are you ready for quiz? ");
		System.out.print("Please enter Y for Yes and N for No "); 
		String answer=input.next();
		String a = "Y";
		int count = 0;
		if(answer.equals(a)) {
			
			System.out.println("Okay, here it comes!");

			System.out.println("\nQ1 What is the capital of Alaska?");
			System.out.println("       1) Melbourne\n       2) Anchorage\n       3) Juneau");
           int option=input.nextInt();
           if(option==3){
        	   
        	   System.out.println("That's right!");
        	   count = count+1;
           }
           else {
        	   System.out.println("Wrong answer");
           }

			System.out.println("\nQ2 Can you store the value \"cat\" in a variable of type int?");
			System.out.println("       1) Yes\n       2)No");
          int ans=input.nextInt();
          if(ans==2){
       	   
       	   System.out.println("That's right");
       	      count = count+1;
          }
          else{
       	   System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.\n");
          }
		
		System.out.println("Q3) What is the result of 9+6/3?");
		System.out.println("       1) 5\n       2) 11\n       3) 15/3");
          int b=input.nextInt();
             if(b==2){
   	   
   	            System.out.println("That's correct!");
   	            
   	            count = count+1;
      }
      else{
   	   System.out.println("Wrong answer");
      }
           if(count==1){  
             System.out.println("Overall, you got 1 out of 3 correct.\nThanks for playing!");
	}
           else if(count==2){
        	   System.out.println("Overall, you got 2 out of 3 correct.\nThanks for playing!");
           }
           else if(count==3){
        	   System.out.println("Overall, you got 3 out of 3 correct.\nThanks for playing!");
           }
           else{
        	   System.out.println("Sorry! You give all wrong answers.");
           }
		}
  else {
			System.out.println("You can not attempt quiz");
		}
	
		
	}
	}

