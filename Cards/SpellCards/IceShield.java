//IceShield.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class IceShield extends Spell{

	public IceShield(){
		super("Ice Shield");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(1);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(2);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Increase friendly monster's def by 2; Increase by 3 if water element type.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose friendly monster to increase their def by 2 or 3 if water element type.");
			System.out.println("\t----------");
			for (int i = 0; i < your.field.count(); i++){
				if (your.field.get(i).cardType.getCardType() == "Monster") {
					System.out.print("\t" + i + 1  + "." + your.field.get(i).cardName.getName() + ": ");
					System.out.print(((Monster) your.field.get(i)).elementType.getElementType());
					System.out.println();
				}
			}
			System.out.print(">> ");
			sm.makeChoice();
			if(((Monster) your.field.get(sm.getChoice() - 1)).elementType.getElementType() == "Water"){
				((Monster) your.field.get(sm.getChoice() - 1)).def.setCriticalHit(((Monster) your.field.get(sm.getChoice() - 1)).def.getCriticalHit() + 3);
				System.out.print("\n\n->");
				System.out.println(your.field.get(sm.getChoice() - 1).cardName.getName() + "'s def has increased by 3.");
				sm.sleep();
				sm.sleep();
				sm.sleep();
			}
			else{
				((Monster) your.field.get(sm.getChoice() - 1)).def.setCriticalHit(((Monster) your.field.get(sm.getChoice() - 1)).def.getCriticalHit() + 2);
				System.out.print("\n\n->");
				System.out.println(your.field.get(sm.getChoice() - 1).cardName.getName() + "'s def has increased by 2.");
				sm.sleep();
				sm.sleep();
				sm.sleep();
			}
	}





}
