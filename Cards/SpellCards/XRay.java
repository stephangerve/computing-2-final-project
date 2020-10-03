//XRay.java
package Cards.SpellCards;
import CardProperties.*;
import GameProperties.*;
import Menus.*;
import java.util.*;


public class XRay extends Spell{

	public XRay(){
		super("X-Ray");
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
		value.setLightMana(1);
		value.setAnyMana(0);
		

		setSpellDesc("See opponent's hand.");
	}
	public void activateSpell(Player your, Player opponent){
		for (int i = 0; i < opponent.hand.count(); i++){
			System.out.print("\t" + i + 1  + "." + opponent.hand.get(i).cardName.getName());
			System.out.println();
		}
		sm.sleep();
		sm.sleep();
		sm.sleep();
		sm.sleep();
	}





}
