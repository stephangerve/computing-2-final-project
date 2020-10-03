//HandMenu.java
package Menus;
import Cards.*;
import GameProperties.*;
import java.util.*;




public class HandMenu extends Menu{
	
	String nameOfCard;
	public void showOptions(){
		
	}
	public void showOptions(Player your, int c){
			nameOfCard = your.hand.get(c).cardName.getName();
			while(getChoice() != 0 || getChoice() != -1){
		        	System.out.println("\t" + nameOfCard);
		                System.out.println("\t----------");
		                System.out.println("\t1.get info");
		                System.out.println("\t2.bank");
		                System.out.println("\t3.summon");
		                System.out.println("\t4.discard");
		                System.out.println("\t0.exit");
		                System.out.print(">> ");
		                resetChoice();
				makeChoice();
		                //card in hand choice 1: show card's info
		                if(getChoice() == 1){
		                	//System.out.println();
		                        //System.out.println("==================");
		                        your.hand.get(c).getCardInfo();
		                        //System.out.println("==================");
					//System.out.println();
				}
				else if(getChoice() == 2){
					System.out.println();
					your.hand.get(c).value.printBankPoints();
					System.out.println(" will be added to bank.");
					System.out.println("Bank " + nameOfCard + "? (y/n)");
					System.out.print(">> ");
					enterString();
					if(getString().equals("y")){
						try{
							your.addToBank(c);
						}
						catch(Message e){
							System.out.println(e);
							sleep();
						}
					
					}
					else{
						System.out.println();
					}	
					resetChoice();
					return;
				}
				//card in hand choice 3: summon
				else if(getChoice() == 3){
					if(your.getHasSummoned() == false){
						System.out.println();
						System.out.print("cost of " + nameOfCard + ": ");
						your.hand.get(c).cost.printBankPoints();
						System.out.println();
						System.out.println("summon? (y/n): ");
						System.out.print(">> ");
						enterString();
						if(getString().equals("y")){
								//if(field.getMonsterCount() == 5){
							//	throw new Message(2,"sumnot","maxmp");
										//}
											//else if(field.getMonsterCount() < 5){
							try{	
								your.summon(c);
							}
							catch(Message e){
								System.out.println(e);
								sleep();
							}
								//throw new Message(1, nameOfCard, "summon");
										//}
						}
						else{
							System.out.println();
						}
						resetChoice();
						return;
					}
					else if(your.getHasSummoned() == true){
						System.out.print("\n\n->");
						System.out.println("Already summoned a monster this turn.");
					}
						
				}
				//card in hand choice 4: discard
				else if(getChoice() == 4){
		                        System.out.println();
					System.out.println(nameOfCard + " will be discarded.");
		                        System.out.println("Discard? (y/n)");
					System.out.print(">> ");
					enterString();
					if(getString().equals("y")){
		                     		try{
							your.discard(c, your.hand);
						}
						catch(Message e){
							System.out.println(e);
							sleep();
						}
						
						//throw new Message(1, nameOfCard, "dcard");
		                    		
					}
					else{
						System.out.println();
					}
					resetChoice();
					return;
				}
				else if(getChoice() == 0){
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
