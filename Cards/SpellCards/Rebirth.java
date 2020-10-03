//Rebirth.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Rebirth extends Spell{

	public Rebirth(){
		super("Rebirth");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(1);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(2);
		value.setAnyMana(0);
		

		setSpellDesc("Bring any monster from your graveyard to the field.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose friendly monster in grave to bring to the field.");
			System.out.println("\t----------");
			for (int i = 0; i < your.gyard.count(); i++){
				if (your.gyard.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + your.gyard.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			your.field.addCard(your.gyard.transferCard(sm.getChoice() - 1));
			System.out.print("\n\n->");
			System.out.println(your.field.get(your.field.lastIndexOf(your.field.lastCard())).cardName.getName() + " is brought back to the field.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
	}





}
