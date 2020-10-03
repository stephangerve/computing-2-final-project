//Medicine.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Medicine extends Spell{

	public Medicine(){
		super("Medicine");
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
		value.setAnyMana(0);
		

		setSpellDesc("Heal a friendly monster by 2 hp.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose friendly monster to heal by 2 hp.");
			System.out.println("\t----------");
			for (int i = 0; i < your.field.count(); i++){
				if (your.field.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + your.field.get(i).cardName.getName());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			((Monster) your.field.get(sm.getChoice() - 1)).monsterHP.setActualHP(((Monster) your.field.get(sm.getChoice() - 1)).monsterHP.getActualHP() + 2);
			System.out.print("\n\n->");
			System.out.println(your.field.get(your.field.lastIndexOf(your.field.lastCard())).cardName.getName() + "'s hp has increased by 2.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
	}





}
