//Necromancy.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Necromancy extends Spell{

	public Necromancy(){
		super("Necromancy");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(2);
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
		value.setAnyMana(0);
		

		setSpellDesc("Bring any dark monster from grave to field.");
	}
	public void activateSpell(Player your, Player opponent){
		int n = 0;
		System.out.println("\tChoose friendly dark monster in grave to bring to the field.");
		System.out.println("\t----------");
		for (int i = 0; i < your.gyard.count(); i++){
			if (your.gyard.get(i).cardType.getCardType() == "Monster") {
				if (((Monster) your.gyard.get(i)).elementType.getElementType() == "Dark") {
					n++;
					System.out.print("\t" + i + 1  + "." + your.gyard.get(i).cardName.getName());
					System.out.println();
				}
			}
		}
		if(n == 0){
			System.out.print("\n\n->");
			System.out.println("No dark monsters in grave.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
		else{
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





}
