import java.util.*;



public class Menu{

	public static void main(String args[]){
		
		Menu m = new Menu();
		m.display();
		
	
	}

	public void display(){
		Option newGame = new Option("Play new game","vs Human", null, "vs Computer", null);
		Option loadGame = new Option("Load saved game","Game 1", null, "Game 2", null);
		Option play = new Option("Main menu","Play game", newGame, "Load game", loadGame);
		
		Option current = play;
		while(current != null){
			current = current.displayOption();
		}	
	
	}





}
