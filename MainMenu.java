//MainMenu.java
import Menus.*;
import CardProperties.*;
import GameProperties.*;
import Cards.*;
import Cards.MonsterCards.*;
import java.util.*;




public class MainMenu extends Menu{

	MDBMenu MDBM;
	SDBMenu SDBM;
	Game duel;
	StatsMenu SM;
	public static void main(String args[]){
		new MainMenu();
	}
	public MainMenu(){
		showOptions();
	}
	public void showOptions(){
		while(getChoice() == -1){
			clearScreen();
			System.out.println("             ___________               ");
			System.out.println("            |           |              ");
			System.out.println(" ___________| MAIN MENU |_____________ ");
			System.out.println("|   ________|___________|__________   |");
		 	System.out.println("|  |enter 1 to play (vs. human)    |  |");
		    	System.out.println("|  |enter 2 to see monster database|  |");
			System.out.println("|  |enter 3 to see spell database  |  |");
			System.out.println("|  |enter 4 for stats/settings     |  |");
			System.out.println("|  |enter 0 to quit                |  |");
			System.out.println("|   -------------------------------   |");
			System.out.println("|_____________________________________|");
			System.out.print(">> ");
			makeChoice();
			if(getChoice() == 1){
				duel = new Game();
			}			
			else if(getChoice() == 2){
				MDBM = new MDBMenu();
				MDBM.showOptions();
			}
			else if(getChoice() == 3){
				SDBM = new SDBMenu();
				SDBM.showOptions();
			}
			else if(getChoice() == 4){
				SM = new StatsMenu();
				SM.showOptions();	
			}
			else if(getChoice() == 0){
				return;
			}
			resetChoice();
		
		}
		
	}






}
