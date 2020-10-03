//Minotaur.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Minotaur extends Monster{
	
	
	public Minotaur(){
		super("Minotaur", "Bronze", "Earth", 7, 7, 25, 6);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(1);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(1);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		
		
	}

}
