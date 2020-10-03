//Reinforcements.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Reinforcements extends Spell{

	public Reinforcements(){
		super("Reinforcements");
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
		

		setSpellDesc("Summon an extra monster this turn.");
	}
	public void activateSpell(Player your, Player opponent){
		your.resetHasSummoned();
		System.out.print("\n\n->");
		System.out.println("An extra monster can be summoned.");
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
