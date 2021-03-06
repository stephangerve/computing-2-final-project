//Leprechaun.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Leprechaun extends Monster{
	
	
	public Leprechaun(){
		super("Leprechaun", "Bronze", "Earth", 5, 5, 15, 4);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(1);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		
		setAbilityName("Fortune");
		setAbilityDesc("Add 1 bronze coin to bank.");
	}

}
