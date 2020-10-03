//Regenerate.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Regenerate extends Spell{

	public Regenerate(){
		super("Regenerate");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(3);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(1);
		

		setSpellDesc("Restore all hp of all friendly monsters on field.");
	}
	public void activateSpell(Player your, Player opponent){
		for(int i = 0; i < your.field.count(); i++){
			if(your.field.get(i).cardType.getCardType() == "Monster"){
				((Monster) your.field.get(i)).monsterHP.setActualHP(((Monster) your.field.get(sm.getChoice() - 1)).monsterHP.getInitialHP());
				System.out.print("\n\n-> " + your.field.get(i).cardName.getName() + " hp restored.");
				sm.sleep();
			}
			
		}
		sm.sleep();
		sm.sleep();
	}





}
