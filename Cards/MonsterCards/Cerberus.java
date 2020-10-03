//Cerberus.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Cerberus extends Monster{
	
	
	public Cerberus(){
		super("Cerberus", "Silver", "Fire", 10, 5, 15, 5);	
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
		value.setBronzeCoins(0);
		value.setFireMana(2);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);

		setAbilityName("Repeat");
		setAbilityDesc("Can attack twice.");
		
		
	}

}
