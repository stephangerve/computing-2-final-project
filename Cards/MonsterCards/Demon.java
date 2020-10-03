//Demon.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Demon extends Monster{
	
	public Demon(){
		super("Demon", "Gold", "Dark", 0, 28, 50, 9);	
		cost.setGoldCoins(1);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(3);
		cost.setLightMana(0);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(5);
		value.setLightMana(0);
		value.setAnyMana(0);

		setAbilityName("Possession");
		setAbilityDesc("Select any enemy monster to attack another enemy monster.");
	}

}
