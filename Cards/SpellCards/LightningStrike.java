//LightningStrike.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class LightningStrike extends Spell{

	public LightningStrike(){
		super("Lightning Strike");
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(1);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(2);
		value.setAnyMana(0);
		

		setSpellDesc("Deal 5 damage directly to opponent.");
	}
	public void activateSpell(Player your, Player opponent){
		opponent.playerHP.damage(5);
		System.out.print("\n\n-> 5 damage dealt to " + opponent.playerName.getName());
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
