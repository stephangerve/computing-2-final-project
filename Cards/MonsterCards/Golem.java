//Golem.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Golem extends Monster{
	
	public Golem(){
		super("Golem", "Bronze", "Earth", 9, 18, 35, 7);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(2);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(2);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(2);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(1);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);

		setAbilityName("Protection");
		setAbilityDesc("Increase all friendly monster's defense points by 1.");
		
	}

}
