//FieldMenu.java
package Menus;
import Cards.*;
import GameProperties.*;
import CardProperties.*;
import java.util.*;




public class FieldMenu extends Menu{
	
	String nameOfCard;
	public void showOptions(){
		
	}
	public void showOptions(Player your, Player opponent, int c){
		nameOfCard = your.field.get(c).cardName.getName();
		if(your.field.get(c).cardType.getCardType() == "Monster"){
			while(getChoice() != 0 || getChoice() != -1){
		        	System.out.println("\t" + nameOfCard);
		                System.out.println("\t----------");
		                System.out.println("\t1.get info");
		                System.out.println("\t2.attack");
		                System.out.println("\t3.use ability");
		                System.out.println("\t0.exit");
		                System.out.print(">> ");
		                resetChoice();
				makeChoice();
		                //get info
		                if(getChoice() == 1){
		                	//System.out.println();
		                        //System.out.println("==================");
		                        your.field.get(c).getCardInfo();
		                        //System.out.println("==================");
					//System.out.println();
				}
				//attack
				else if(getChoice() == 2){
					if(your.getTurnCount() == 1){
						System.out.println();
						System.out.println();
						System.out.print("-> ");
						System.out.println("you cannot attack on very first turn.");
						sleep();
					}
					else if(((Monster) your.field.get(c)).atk.getHasBattled() == true){
						System.out.println();
						System.out.println();
						System.out.print("-> ");
						System.out.print(nameOfCard);
						System.out.println(" already attacked.");
						sleep();
					}
					else if(((Monster) your.field.get(c)).getUsedAbility() == true){
						System.out.println();
                                                System.out.println();
                                                System.out.print("-> ");
                                                System.out.print(nameOfCard);
                                                System.out.println(" Cannot attacked since its ability has been used.");
                                                sleep();
					}
					else if(((Monster) your.field.get(c)).atk.getHasBattled() == false){	
						your.attack(c, opponent);
					}
					resetChoice();
					return;
				}	
				else if(getChoice() == 3){

				}
				//exit
				else if(getChoice() == -1 || getChoice() == 0){
					return;
				}
				else{
					System.out.println();
                                	System.out.println();
                                	System.out.println("-> Invalid entry. Please try again.");
				}
			}
		}
	}
}
