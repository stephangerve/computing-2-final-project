//Program.java
import Menus.*;
import CardProperties.*;
import GameProperties.*;
import Cards.*;
import Cards.MonsterCards.*;
import java.util.*;




class Program{

	MainMenu MM;
	MDBMenu MDBM;
	Game duel;
	public static void main(String args[]){
		//MDBM = new MDBMenu();	
		new Program();
	}
	Program(){
		MM = new MainMenu();
		MDBM = new MDBMenu();
		while(MM.getChoice() == -1){
			MM.showOptions();
			MM.makeChoice();
			if(MM.getChoice() == 1){
				MDBM.showOptions();
			}
			else if(MM.getChoice() == 3){
				duel = new Game();
			}	
			MM.resetChoice();
		}
		
	}



}
