import java.util.Scanner;


public class SpaceBoxing {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your current earth weight: ");
		  int weight_on_earth=input.nextInt();
		  
			System.out.println("\nI have information for the following planets: ");
			System.out.println("   1. Venus  2. Mars  3. Jupiter\n   4. Saturn  5. Uranus  6. Neptune");
			
			System.out.print("\nWhich planet are you visiting? ");
			  int planet_no=input.nextInt();
			  
			  if(planet_no==1){
				  
			      double gravity = 0.78;
			      double weight_on_planet = weight_on_earth * gravity;
			        System.out.println("\nYour weight would be "+weight_on_planet+" pounds on that planet.");
			  }
			  else if(planet_no==2){
				  
			      double gravity = 0.39;
			      double weight_on_planet = weight_on_earth * gravity;
			        System.out.println("\nYour weight would be "+weight_on_planet+" pounds on that planet.");
			  }
              else if(planet_no==3){
				  
			      double gravity = 2.65;
			      double weight_on_planet = weight_on_earth * gravity;
			        System.out.println("\nYour weight would be "+weight_on_planet+" pounds on that planet.");
			  }
              else if(planet_no==4){
				  
			      double gravity = 1.17;
			      double weight_on_planet = weight_on_earth * gravity;
			        System.out.println("\nYour weight would be "+weight_on_planet+" pounds on that planet.");
			  }
              else if(planet_no==5){
				  
			      double gravity = 1.05;
			      double weight_on_planet = weight_on_earth * gravity;
			        System.out.println("\nYour weight would be "+weight_on_planet+" pounds on that planet.");
			  }
              else if(planet_no==6){
				  
			      double gravity = 1.23;
			      double weight_on_planet = weight_on_earth * gravity;
			        System.out.println("\nYour weight would be "+weight_on_planet+" pounds on that planet.");
			  }
		}

	

}
