import java.util.Scanner;


public class WeekdayName {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Weekday 1: Sunday");
		System.out.println("Weekday 2: Monday");
		System.out.println("Weekday 3: Tuesday");
		System.out.println("Weekday 4: Wednesday");
		System.out.println("Weekday 5: Thursday");
		System.out.println("Weekday 6: Friday");
		System.out.println("Weekday 7: Saturday");
		System.out.println("Weekday 0: Saturday\n");
		System.out.println("Weekday 43: error");
		System.out.println("Weekday 17: error");
		System.out.println("Weekday -1: error");
	
	 int weekday=input.nextInt();
	
	 if(weekday==1){
		 
		 System.out.println("Today is a Sunday!");
	    }
	 else if(weekday==2){
		 
		 System.out.println("Today is a Monday!");
	    }
	 else if(weekday==3){
	 
	     System.out.println("Today is a Tuesday!");
        }
	 else if(weekday==4){
	 
	     System.out.println("Today is a Wednesday!");
        }
	 else if(weekday==5){
	 
	     System.out.println("Today is a Thursday!");
        }
	 else if(weekday==6){
	 
	     System.out.println("Today is a Friday!");
        }
	 else if(weekday==7){
		 
	     System.out.println("Today is a Saturday!");
        }
     else if(weekday==0){
		 
	     System.out.println("Today is a Saturday!");
        }
     else{
    	 System.out.println("error");
     }
	 
	}

}
