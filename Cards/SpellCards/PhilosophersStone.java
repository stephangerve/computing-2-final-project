//PhilosophersStone.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class PhilosophersStone extends Spell{

	public PhilosophersStone(){
		super("Philosopher's Stone");
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
		value.setAnyMana(2);
		

		setSpellDesc("Convert any bronze coin to a gold coin.");
	}
	public void activateSpell(Player your, Player opponent){
		if(your.bank.getBronzeCoins() > 0){
			your.bank.setBronzeCoins(your.bank.getBronzeCoins() - 1);
			your.bank.setGoldCoins(your.bank.getGoldCoins() + 1);
			System.out.print("\n\n->");
			System.out.println("One bronze coin has been converted into a gold coin.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
		else{
			System.out.print("\n\n->");
			System.out.println("You don't own any bronze coins.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
	}





}
