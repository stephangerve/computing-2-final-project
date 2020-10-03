//Refund.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Refund extends Spell{

	public Refund(){
		super("Refund");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(2);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(1);
		

		setSpellDesc("Bring any friendly monster on field back to hand and add the cost to bank.");
	}
	public void activateSpell(Player your, Player opponent){
		if(your.hand.count() < 7){
			System.out.println("\tChoose friendly monster on field to bring back to hand.");
			System.out.println("\t----------");
			for (int i = 0; i < your.field.count(); i++){
				if (your.field.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + your.field.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			your.hand.addCard(your.field.transferCard(sm.getChoice() - 1));
			System.out.print("\n\n->");
			System.out.println(your.hand.get(your.hand.lastIndexOf(your.hand.lastCard())).cardName.getName() + " is brought from field to hand.");
			sm.sleep();
			your.bank.deposit(your.hand.lastCard());
			System.out.print("\n\n->");
			System.out.println("Cost of " + your.hand.get(your.hand.lastIndexOf(your.hand.lastCard())).cardName.getName() + " added to bank.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
		else{
			System.out.print("\n\n->");
			System.out.println("Cannot add anymore cards to hand.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
	}





}
