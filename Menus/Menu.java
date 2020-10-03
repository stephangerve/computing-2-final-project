//Menu.java
package Menus;
import java.util.*;




public abstract class Menu{

	int choice;
	String enteredString;
	Scanner input;
	public Menu(){
		input = new Scanner(System.in);
		resetChoice();
	//	showOptions();
		
	}
	public abstract void showOptions();
	public void resetChoice(){
		choice = -1;
	}
	public void makeChoice(){
		/*if(input.hasNextInt()){
			choice = input.nextInt();
			input.nextLine();
		}*/
		enterString();
		try{
			choice = Integer.parseInt(enteredString);
		}
		catch(NumberFormatException e){
			System.out.print("\n\n->");
			System.out.println("Invalid Entry. Enter an integer");
			resetChoice();
			sleep();
			sleep();
		}
		
	}
	public int getChoice(){
		return choice;
	}
	public void enterString(){
		//input.nextLine();
		if(input.hasNextLine()){
			enteredString = input.nextLine();
		}
		//return "failed!";		
	
	}
	public String getString(){
		return enteredString;
	}
	public void clearScreen(){
		System.out.print("\033[H\033[2J");
		System.out.flush();

	}
	public static void sleep(){
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public void enterAnyNum(){
		System.out.println();
		System.out.println("Enter any number to start.");
		enterString();
	}




}
