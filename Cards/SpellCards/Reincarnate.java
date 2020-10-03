//Reincarnate.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Reincarnate extends Spell{

	public Reincarnate(){
		super("Reincarnate");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(1);
		

		setSpellDesc("Shuffle any monster from your graveyard to deck.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose friendly monster in grave to shuffle into deck.");
			System.out.println("\t----------");
			for (int i = 0; i < your.gyard.count(); i++){
				if (your.gyard.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + your.gyard.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			your.deck.addCard(your.gyard.transferCard(sm.getChoice() - 1));
			your.deck.shuffle();
			System.out.print("\n\n->");
			System.out.println(your.field.get(your.field.lastIndexOf(your.field.lastCard())).cardName.getName() + " has been shuffled into deck.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
	}





}
