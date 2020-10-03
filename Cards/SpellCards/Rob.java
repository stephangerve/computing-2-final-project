//Rob.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Rob extends Spell{

	public Rob(){
		super("Rob");
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
		

		setSpellDesc("Take 1 bronze coin from opponent's bank and add to your own.");
	}
	public void activateSpell(Player your, Player opponent){
		if(opponent.bank.getBronzeCoins() > 0){
			opponent.bank.setBronzeCoins(opponent.bank.getBronzeCoins() - 1);
			your.bank.setBronzeCoins(opponent.bank.getBronzeCoins() + 1);
			System.out.print("\n\n->");
			System.out.println("One bronze coin has been subtracted from " + opponent.playerName.getName() + " bank and added to yours.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
		else{
			System.out.print("\n\n->");
			System.out.println("Your opponent doesn't have any bronze coins.");
			sm.sleep();
			sm.sleep();
			sm.sleep();
		}
	}





}
