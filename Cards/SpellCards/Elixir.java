//Elixir.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Elixir extends Spell{

	public Elixir(){
		super("Elixir");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(1);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(1);
		

		setSpellDesc("You gain 5 hp.");
	}
	public void activateSpell(Player your, Player opponent){
		your.playerHP.setActualHP(your.playerHP.getActualHP() + 5);
		System.out.print("\n\n->");
		System.out.println("You gain 5 hp.");
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
