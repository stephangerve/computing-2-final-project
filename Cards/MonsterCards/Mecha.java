//Mecha.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Mecha extends Monster{
	
	
	public Mecha(){
		super("Mecha", "Gold", "Light", 24, 20, 25, 7);	
		cost.setGoldCoins(1);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(1);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(1);
		cost.setAnyMana(0);

		value.setGoldCoins(0);
		value.setSilverCoins(1);
		value.setBronzeCoins(1);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(0);
		
		setAbilityName("Obliterate");
		setAbilityDesc("Destroy any enemy monster for 3 fire mana.");
		
	}

}
