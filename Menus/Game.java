//Game.java
package Menus;
import GameProperties.*;
import java.util.*;



public class Game extends Menu{

	Player one;
	Player two;
	String winner;
	String result;
	//PlayerMenu PM;
	HandMenu HM;
	FieldMenu FM;

	public Game(){
		clearScreen();
		System.out.print("Enter player one name: ");
		enterString();
		one = new Player(getString());
		System.out.print("Enter player two name: ");
		enterString();
		two = new Player(getString());
		one.setOpponent(two);
		two.setOpponent(one);
		HM = new HandMenu();
		FM = new FieldMenu();
		enterAnyNum();
		clearScreen();
		for(int i = 0; i < 3; i++){
			System.out.print("***********************************************");
			System.out.println("**************************************************");
			for(int j = 0; j < 10; j++){
				System.out.print("\n*\t\t\t\t\t\t\t\t\t\t\t\t*\n");
			}
			System.out.println("\n*\t\t\t\t\tGAME BEGINS!\t\t\t\t\t\t*");
			for(int k = 0; k < 10; k++){
				System.out.print("\n*\t\t\t\t\t\t\t\t\t\t\t\t*\n");
			}
			System.out.print("***********************************************");
			System.out.println("**************************************************");
			sleep();
			clearScreen();
			sleep();
		}
		winner = play();
		whoWon();
	}
	public String play(){
		//play() continues until one of the players hp or deck count = 0
		while(one.lose() == false || two.lose() == false){
			
			result = playerTurn(one, two);
			/*if(result == "end turn"){
				break;
			}*/
			if(result == "forfeit"){
				return two.playerName.getName();
			}
			else if(result.equals(one.playerName.getName())){
				return two.playerName.getName();
			}
			else if(result.equals(two.playerName.getName())){
				return one.playerName.getName();
			}

			result = playerTurn(two, one);
			if(result == "forfeit"){
				return one.playerName.getName();
			}
			else if(result.equals(two.playerName.getName())){
				return one.playerName.getName();
			}
			else if(result.equals(one.playerName.getName())){
				return two.playerName.getName();
			}

			
		}
		return "draw";

	}
	public void whoWon(){
		clearScreen();
		for(int i = 0; i < 3; i++){
			System.out.print("***********************************************");
			System.out.println("**************************************************");
			for(int j = 0; j < 20; j++){
				System.out.println("\n\t\t\t\t" + winner + " won\t\t\t");
			}
			System.out.print("***********************************************");
			System.out.println("**************************************************");
			sleep();
			clearScreen();
			sleep();
		}
	}
	public String playerTurn(Player your, Player opponent){
		your.increTurnCount();
		your.resetField();
		your.resetHasSummoned();
		try{
			your.draw();
		}
		catch(Message e){
			System.out.println(e);
		}
		resetChoice();
		while(getChoice() != 0){
			clearScreen();
			//LOSING CONDITIONS
			if(your.lose() == true){
				return your.playerName.getName();			
			}
			else if(opponent.lose() == true){
				return opponent.playerName.getName();
			}
			System.out.print("***********************************************");
			System.out.println("***********************************************");
			System.out.println(your.playerName.getName() + "'s turn");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			opponent.getPlayerInfo();
			System.out.println();
			System.out.println("field:");	
			System.out.print("   _____________________________________________________");
			System.out.println("___________________________________________");
			opponent.field.show();
			System.out.print("   _____________________________________________________");
			System.out.println("___________________________________________");
			your.field.show();
			System.out.print("   _____________________________________________________");
			System.out.println("___________________________________________");
			System.out.println();
			System.out.println();
			your.getPlayerInfo();
			your.hand.show();
			showOptions(your);
			//your.clearField();
			//might put these in showOptions	
			resetChoice();
			makeChoice();
			if(getChoice() == 0){
				System.out.println();
		           	System.out.println("end of " + your.playerName.getName() + "'s turn");
		          	System.out.print("***********************************************");
		           	System.out.println("***********************************************"); 
		            	System.out.println();
				//Created sleep method to avoid dealing with try, catch, and thread.
				sleep();
				return "end turn";
			}
			else if(getChoice() >= 1 && getChoice() <= 7 ){
				//try{
				HM.showOptions(your, getChoice() - 1);
					//resetChoice();
				//}
				//catch(Message e){
				//	System.out.println(e);
				//}
			}
			else if(getChoice() >= 11 && getChoice() <= 17){
				FM.showOptions(your, opponent, getChoice() - 11);
			}
			else if(getChoice() == 8){
				your.gyard.show();
				sleep();
				sleep();
				enterAnyNum();
				
			}
			else if(getChoice() == 9){
				opponent.gyard.show();
				sleep();
				sleep();
				enterAnyNum();
			}
			else if(getChoice() == 999){
				System.out.print(">> Do you wish to forfeit? (y/n): ");
				enterString();
		            	if(getString().equals("y")){
		                	System.out.print(">> Are you sure? (y/n): ");
			       	enterString();
		                if(getString().equals("y")){
		                    return "forfeit";
		                }
		            }
		            System.out.println();
		            System.out.println();
			}
			else{
				System.out.println();
		        	System.out.println();
		        	System.out.println("-> Invalid entry. Please try again.");
			}
	
		
		}
		return "failed!";
	}
	public void showOptions(){
	
	}
	public void showOptions(Player your){
		if(your.hand.count() > 0 && your.field.count() > 0){
		       	System.out.println(">> enter no. of card for options (field or hand)");
		}
		else if(your.hand.count() > 0 && your.field.count() == 0){
		     	System.out.println(">> enter no. of card for options (hand only)");
		}
		else if(your.hand.count() == 0 && your.field.count() > 0){
		      	System.out.println(">> enter no. of card for options (field only)");
		}
		else if(your.hand.count() == 0 && your.field.count() == 0){
		            //no options; end turn
		}
		System.out.println(">> enter 8 to show your graveyard");
		System.out.println(">> enter 9 to show opponent's graveyard");
		System.out.println(">> enter 0 to end your turn");
		System.out.println(">> enter 999 to forfeit match");
		System.out.print(">> ");
		//resetChoice();
		//makeChoice();
	}

}
