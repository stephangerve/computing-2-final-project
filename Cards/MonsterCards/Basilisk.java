//Basilisk.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Basilisk extends Monster{
	
	
	public Basilisk(){
		super("Basilisk", "Silver", "Earth", 17, 15, 50, 7);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(1);
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
		
		setAbilityName("Stun");
		setAbilityDesc("Choose an enemy monster. That enemy monster defense miss rate is 50%.");
	}

}
