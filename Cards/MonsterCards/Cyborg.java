//Cyborg.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Cyborg extends Monster{
	
	
	public Cyborg(){
		super("Cyborg", "Silver", "Dark", 17, 16, 25, 7);	
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
		value.setDarkMana(1);
		value.setLightMana(1);
		value.setAnyMana(0);

		setAbilityName("Accuracy");
		setAbilityDesc("Increase critical chance by 15%.");
		
		
	}

}
