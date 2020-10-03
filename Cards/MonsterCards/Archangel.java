//Archangel.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Archangel extends Monster{
	
	public Archangel(){
		super("Archangel", "Gold", "Light", 21, 24, 35, 8);	
		cost.setGoldCoins(1);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(1);
		cost.setAnyMana(1);

		value.setGoldCoins(0);
		value.setSilverCoins(1);
		value.setBronzeCoins(2);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(1);
		value.setAnyMana(1);

		setAbilityName("Protection");
		setAbilityDesc("Increase all friendly monster's defense points by 2.");
		
	}

}
