//Paladin.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Paladin extends Monster{
	
	
	public Paladin(){
		super("Paladin", "Silver", "Light", 15, 12, 35, 6);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(1);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(1);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(1);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(1);
		value.setAnyMana(0);

		setAbilityName("Heal");
		setAbilityDesc("All friendly monsters gain 1 HP.");
		
		
	}

}
