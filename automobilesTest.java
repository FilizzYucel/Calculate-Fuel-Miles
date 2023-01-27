package lab4task;
import java.util.Scanner;


public class automobilesTest {
	
	
		
			public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			automobiles user= new automobiles(0, 0, 0);
			
			
			int i=0;
			while(i <2) {
				
				// One gallon has 4.5 liter, i found it on internet.
				
				System.out.println("Please enter miles: ");
				int miles= input.nextInt();
				user.setMiles(miles); 
				
				System.out.println("Please enter gallons: ");
				int gallons= input.nextInt();
				user.setGallons(gallons);	
				
				
				System.out.println("Your amount of fuel: "+user.getTotal());
				
				i++;

			}
			

		
		System.out.println("Your miles: "+user.getMiles());
		System.out.println("Your gallons: "+user.getGallons());
		System.out.println("Your total liter: "+user.getLiter());
		}
		
	}


