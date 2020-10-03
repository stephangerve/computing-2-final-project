//Psychic.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Psychic extends Spell{

	public Psychic(){
		super("Psychic");
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
		value.setAnyMana(1);
		

		setSpellDesc("See next 5 cards of opponent's deck.");
	}
	public void activateSpell(Player your, Player opponent){
		for (int i = 0; i < 5; i++){
			System.out.print("\t" + i + 1  + "." + opponent.deck.get(opponent.deck.count() - 1 - i).cardName.getName());
			System.out.println();
		}
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
