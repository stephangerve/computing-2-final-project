//Treasure.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Treasure extends Spell{

	public Treasure(){
		super("Treasure");
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
		value.setSilverCoins(1);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Add 1 silver coin to bank");
	}
	public void activateSpell(Player your, Player opponent){
		your.bank.setSilverCoins(your.bank.getSilverCoins() + 1);
		System.out.print("\n\n->");
		System.out.println("One silver coin has been added to your bank.");
		sm.sleep();
		sm.sleep();
		sm.sleep();
		
	}





}
