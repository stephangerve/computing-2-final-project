//Gift.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class Gift extends Spell{

	public Gift(){
		super("Gift");
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
		

		setSpellDesc("Draw 2 cards");
	}
	public void activateSpell(Player your, Player opponent){
		try{
			your.draw();
		}
		catch(Message e){
			System.out.println(e);
			sm.sleep();
		}
		try{
			your.draw();
		}
		catch(Message e){
			System.out.println(e);
			sm.sleep();
		}
		sm.sleep();
		sm.sleep();
	}





}
