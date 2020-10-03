//Poison.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Poison extends Spell{

	public Poison(){
		super("Poison");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(2);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(1);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Deal 1 damage, decrease atk and def by 1, and reduce critical chance to 15% of an enemy monster.");
	}
	public void activateSpell(Player your, Player opponent){
		System.out.println("\tChoose enemy monster to poison.");
		System.out.println("\t----------");
		for (int i = 0; i < opponent.field.count(); i++){
			if (opponent.field.get(i).cardType.getCardType() == "Monster") {
				System.out.print("\t" + i + 1  + "." + opponent.field.get(i).cardName.getName());
				System.out.println();
			}
		}
		System.out.print(">> ");
		sm.makeChoice();
		((Monster) your.field.get(sm.getChoice() - 1)).monsterHP.damage(1);
		((Monster) your.field.get(sm.getChoice() - 1)).atk.setCriticalHit(((Monster) your.field.get(sm.getChoice() - 1)).atk.getCriticalHit() - 1);
		((Monster) your.field.get(sm.getChoice() - 1)).def.setCriticalHit(((Monster) your.field.get(sm.getChoice() - 1)).def.getCriticalHit() - 1);
		((Monster) your.field.get(sm.getChoice() - 1)).atk.setCriticalChance(15);
		((Monster) your.field.get(sm.getChoice() - 1)).def.setCriticalChance(15);
		System.out.print("\n\n->");
		System.out.println(opponent.field.get(sm.getChoice() - 1).cardName.getName() + " is dealt 1 damage, atk and def decreased by 1, and critical chance reduced to 15%.");
		sm.sleep();
		sm.sleep();
		sm.sleep();
		
		
	}





}
