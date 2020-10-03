//Hand.java
package GameProperties.Zones;
import CardProperties.*;
import java.util.*;



public class Hand extends Zone{


	public Hand(){
		super(7);
	}
	public void show(){
		System.out.println(); 
    		System.out.print("hand: ");
       		if(count() == 0){
       			System.out.print("no cards in hand");
       	 	}
        	else if (count() > 0){
			System.out.println();//New version
			System.out.println("\t\t----------------");//New Version
      	  		for(int i = 0; i < count(); i++){
                		//System.out.print(i + 1 + ".");
                		System.out.print("\t\t|" + (i + 1) + ". ");//New Version
				if(get(i).cardType.getCardType() == "Monster"){
                			((Monster) get(i)).getMonsterInfo();		
				}
				else if(get(i).cardType.getCardType() == "Spell"){
					System.out.print(((Spell) get(i)).cardName.getName());
				}
				/*if(i + 1 == count()){
               	 			System.out.print("");
        		       	}
             	  		else{
                			System.out.print(", ");
                		}*/
				System.out.println();
				System.out.println("\t\t----------------");//New Version

            		}
        	}
        	System.out.println();	
	}
	public void makeHand(Deck deck){
		for(int i = 0; i < MAX() - 1; i++){
			addCard(deck.lastCard());
			deck.remove(deck.lastIndexOf(deck.lastCard()));
		}
	}



}
