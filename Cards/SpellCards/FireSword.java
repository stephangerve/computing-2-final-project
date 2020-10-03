//FireSword.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class FireSword extends Spell{

	public FireSword(){
		super("Fire Sword");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(1);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(2);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Increase friendly monster's atk by 2; Increase by 3 if fire element type.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose friendly monster to increase their atk by 2 or 3 if fire element type.");
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
			if(((Monster) your.field.get(sm.getChoice() - 1)).elementType.getElementType() == "Fire"){
				((Monster) your.field.get(sm.getChoice() - 1)).atk.setCriticalHit(((Monster) your.field.get(sm.getChoice() - 1)).atk.getCriticalHit() + 3);
				System.out.print("\n\n->");
				System.out.println(your.field.get(sm.getChoice() - 1).cardName.getName() + "'s atk has increased by 3.");
				sm.sleep();
				sm.sleep();
				sm.sleep();
			}
			else{
				((Monster) your.field.get(sm.getChoice() - 1)).atk.setCriticalHit(((Monster) your.field.get(sm.getChoice() - 1)).atk.getCriticalHit() + 2);
				System.out.print("\n\n->");
				System.out.println(your.field.get(sm.getChoice() - 1).cardName.getName() + "'s atk has increased by 2.");
				sm.sleep();
				sm.sleep();
				sm.sleep();
			}
	
	}





}
