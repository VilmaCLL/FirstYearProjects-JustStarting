import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
//These are all the libraries I will use throughout my program.

	public class BestCinema2 {
		//Global variables for this class
		int [] ticketsByAge = new int[3];
		boolean wantMore = true;
		int numOfTickets = 0;
		int totalPerAge = 0;
		int totalPerAge2 = 0;
		int totalPerAge3 = 0;
		int numOfTickets1 = 0;
		int numOfTickets2 = 0;
		int totalOfTickets = 0;
		double montoTotal = totalPerAge * 8 + totalPerAge2 * 10 + totalPerAge3 * 6;
		

			public static final String MainMenu = null;
			//Main Menu method. The program can come back to it regularly.
			public BestCinema2() {
				
				// Greeting and options for the user.
				System.out.println("Welcome to Retro Cinema");
				System.out.println("     ");
				System.out.println("The best classics in full screen!");
				System.out.println("     ");
				System.out.println("Please select your option");
				System.out.println("      ");
				
				System.out.println("1. New Order");
				System.out.println("2. Today's Films");
				System.out.println("3. My Orders History");
				System.out.println("4. Exit");
				
				try{
					
					BufferedReader br =
							new BufferedReader(new InputStreamReader(System.in));
					String option = (br.readLine());
					
					if(option.equals("1")){
						NewOrder();
				    }
					
					else if(option.equals("2")){
						TodaysFilms();
					}
					
					else if(option.equals("3")){
						MyOrdersHistory();
						
					}
					
					else if(option.equals ("4")){
						Exit();
					}
					
			    } catch (Exception e){}
		}
	
				public void NewOrder() {
					//This method is used to show the available movies and for the user to select one to start building a new order.
					System.out.println("   ");
					System.out.println("Please select your movie");
					System.out.println("   ");
			
					String fileName = "/Users/Vilmita/Documents/workspace/BestCinema//Movies.txt";
					//The movies are contained in an external text file, so it can be easily changed by the owner.
					
					String line = "";
					
					
					try {
						Scanner in = new Scanner(new BufferedReader(new FileReader(fileName)));
						while (in.hasNextLine()) {
							line = in.nextLine();
							System.out.println(line);
			
						}
						System.out.println("\n");
			
						in.close();
					} catch (FileNotFoundException e1) {
						System.out.println(e1);
			
					}
			
					System.out.println("8. Back to main menu");
			
					int option = 0;
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
			
						option = Integer.valueOf(br.readLine());
			
					} catch (Exception e) {
					}
			
					
					if ((option == 1) || (option == 2) || (option == 3) || (option == 4)) {
						TodaysTimes();
					}
			
					else if ((option == 8)) {
						new BestCinema2();
					}
			
				}

		
				public void TodaysTimes() {
					//This method is used to show the available times for the movies and for the user to select one, as the second step of building the order.					
					System.out.println("   ");
					System.out.println("Please select the time of your movie");
					System.out.println("   ");
					
					//The available times are also include in an external text file, so they can be changed by the owner.
					String fileName = "/Users/Vilmita/Documents/workspace/BestCinema//Times.txt";
					String line = "";	
					File textFile = new File (fileName);
										
					try {
						Scanner in = new Scanner(textFile);
						line = in.nextLine();
						System.out.println(line);
											
					  while (in.hasNextLine()) {
						line = in.nextLine();
						System.out.println(line);
												
												}
						System.out.println("\n");
											
						in.close();
											
					} catch (FileNotFoundException e1) {System.out.println(e1);
											
					  }
										
					System.out.println("8. Back to main menu");
								
					int option = 0;
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
								
					try {
			
						option = Integer.valueOf(br.readLine());
			
					} catch (Exception e) {
					  }
								
					if ((option == 1) || (option == 2) || (option == 3)) {
						selectingAge();
					}
			
					else if ((option == 8)) {
						new BestCinema2();
					}
							}	
	 
				public void TodaysFilms(){
				//This method is used to give some extra information about the movies. The user can select a movie from here to start the order as well.
					System.out.println("   ");
					System.out.println("Have a look on what we have!");
					System.out.println("   ");
					
					//Information is also changeable in an external text file.
					String fileName = "/Users/Vilmita/Documents/workspace/BestCinema//MoviesInfo.txt";
					String line = "";
					
					
					try {
						Scanner in = new Scanner(new BufferedReader(new FileReader(fileName)));
						while (in.hasNextLine()) {
							line = in.nextLine();
							System.out.println(line);
			
						}
						System.out.println("\n");
						
						in.close();
						
					} catch (FileNotFoundException e1) {
						System.out.println(e1);
			
					}
			
					System.out.println("8. Back to main menu");
					
					
					int option = 0;
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
			
						option = Integer.valueOf(br.readLine());
						
						
					} catch (Exception e) {
					}
			
		
					if ((option == 1) || (option == 2) || (option == 3) || (option == 4)) {
						TodaysTimes();
					}
			
					else if ((option == 8)) {
						new BestCinema2();
					}
				}
	
				
				public void MyOrdersHistory(){
					//This method shows the orders history stored in a text file.
					System.out.println("   ");
					System.out.println("YOUR ORDERS HISTORY");
					System.out.println("   ");
			
					String fileName = "/Users/Vilmita/Documents/workspace/BestCinema//text.txt";
					String line = "";
					
					
					try {
						Scanner in = new Scanner(new BufferedReader(new FileReader(fileName)));
						while (in.hasNextLine()) {
							line = in.nextLine();
							System.out.println(line);
			
						}
						System.out.println("\n");
						
						in.close();
						
					} catch (FileNotFoundException e1) {
						System.out.println(e1);
			
					}
			
					System.out.println("8. Back to main menu");
					
					int backToMain = 0;
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					try {
			
						backToMain = Integer.valueOf(br.readLine());
						
						
					} catch (Exception e) {
					}
					
					if(backToMain == 8) {
						new BestCinema2();
					}
				}
	
				public void Exit(){
					//This method closes the program.
							
					System.out.println("Are you sure?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					
					int quit = 0; 
					
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					try {
			
						quit = Integer.valueOf(br.readLine());
			
					} catch (Exception e) { }
					
					if (quit==1) {
						System.exit(0);
					}
					
					else if (quit==2){
					
						new BestCinema2();
				    }
					
				}
	
	
				public void selectingAge (){ 
					//This method allows the user to select number of tickets according to age and calculates the total amount to be paid depending on each ticket price, and shows it on the screen.
					
					boolean wantMore = true;
	
					int totalPerAge = 0;
					int totalPerAge2 = 0;
					int totalPerAge3 = 0;
					int option = 0;
					int cantidadDeTickets = 0;
					int totalOfTickets = 0;
					
					do {
						
						System.out.println ("Please select your age");
						System.out.println ("");
						System.out.println("1. 14 years or less");
						System.out.println("2. 15 to 64 years");
						System.out.println("3. 65 years or more");
						System.out.println("4. Back to Movies");
						
							
							BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
							
							try {
				
								option = Integer.valueOf(br.readLine());
				
							} catch (Exception e) { }
							
							if ((option == 1) || (option == 2) || (option == 3)) {
									
									System.out.println("Please insert number of tickets");	
								
								BufferedReader number = new BufferedReader(new InputStreamReader(System.in));
								
								try {
				
									cantidadDeTickets = Integer.valueOf(number.readLine());
									totalOfTickets = totalOfTickets + cantidadDeTickets;
									
									if (option == 1){ 
										totalPerAge = cantidadDeTickets;
									}	
									else if (option== 2) { 
										totalPerAge2 = cantidadDeTickets;
									}
									else if (option == 3) {
										totalPerAge3 = cantidadDeTickets;
									}
								}
								 catch (Exception e) {	
								 }	
							}
							else if (option == 4) {
								new BestCinema2();
								wantMore = false;
								
							}
								
								
								int continueShopping = 0;
										
										System.out.println("Would you like to get more tickets?");
										System.out.println("");
										System.out.println("1. Yes");
										System.out.println("2. No");
									
										try{
											
											continueShopping = Integer.valueOf(br.readLine());
									
											 if ( continueShopping == 1){ 
												wantMore = true;
											 }	
											else if (continueShopping == 2) { 
												wantMore = false;
											}
											 
										}
							     catch (Exception e) {	
							     }	
										
				   } while(wantMore); 
												
					
					double montoTotal = (totalPerAge * 8) + (totalPerAge2 * 10) + (totalPerAge3 * 6);
			
					
					System.out.println("Your Order");
					System.out.println(" ");
					System.out.println("Number of tickets: " + totalOfTickets);
					System.out.println("Total amount: " + montoTotal);
					
					writingOrder(totalOfTickets, montoTotal);
					
				 }
	
				public void writingOrder (int tickets, double monto) {	
					//This method writes the information about the order on a text file, the same that can be read by the user when choosing "My Orders History".
					try{
						
						PrintWriter ordering = 
								
								new PrintWriter (new BufferedWriter (new FileWriter ("/Users/Vilmita/Documents/workspace/BestCinema//text.txt", true)));
								
								ordering.println(" ");
								ordering.println("Your Order");
								ordering.println(" ");
								ordering.println("Number of tickets: " + tickets);
								ordering.println("Total amount: " + monto);
								
								ordering.close ();
								
					} catch (Exception e) 
					
					  { System.out.print(e); }
					
					
				}
	
	
	public static void main(String[]args){
		
	new BestCinema2();	
	
		
	}			


}
