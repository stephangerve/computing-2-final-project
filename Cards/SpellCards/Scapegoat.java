//Scapegoat.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Scapegoat extends Spell{

	public Scapegoat(){
		super("Scapegoat");
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
		value.setBronzeCoins(1);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		

		setSpellDesc("Add 1 bronze coin to bank");
	}
	public void activateSpell(Player your, Player opponent){
		your.bank.setBronzeCoins(your.bank.getBronzeCoins() + 1);
		System.out.print("\n\n->");
		System.out.println("One bronze coin has been added to your bank.");
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
