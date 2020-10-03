//Thunderbird.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Thunderbird extends Monster{
	
	
	public Thunderbird(){
		super("Thunderbird", "Silver", "Light", 17, 15, 50, 6);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(3);
		cost.setAnyMana(2);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(3);
		value.setAnyMana(0);
		
		setAbilityName("Paralyze");
		setAbilityDesc("Choose an enemy monster. That enemy monster attack miss rate is 50%.");
	}

}
