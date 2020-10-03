//Wormhole.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Wormhole extends Spell{

	public Wormhole(){
		super("Wormhole");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(1);
		cost.setLightMana(1);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(3);
		

		setSpellDesc("Bring any monster from your deck to the field.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose friendly monster in deck to bring to the field.");
			System.out.println("\t----------");
			for (int i = 0; i < your.deck.count(); i++){
				if (your.deck.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + your.deck.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			your.field.addCard(your.deck.transferCard(sm.getChoice() - 1));
			System.out.print("\n\n->");
			System.out.println(your.field.get(your.field.lastIndexOf(your.field.lastCard())).cardName.getName() + " is brought to the field from deck.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
	}





}
