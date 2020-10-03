//Kraken.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Kraken extends Monster{
	
	
	public Kraken(){
		super("Kraken", "Bronze", "Water", 7, 6, 15, 6);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(1);
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
		
		setAbilityName("Paralyze");
		setAbilityDesc("Choose an enemy monster. That enemy monster attack miss rate is 25%.");
	}

}
