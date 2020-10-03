//Elf.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Elf extends Monster{
	
	public Elf(){
		super("Elf", "Silver", "Earth", 14, 9, 35, 5);	
		cost.setGoldCoins(0);
		cost.setSilverCoins(1);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(1);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(1);
		value.setFireMana(0);
		value.setWaterMana(0);
		value.setEarthMana(0);
		value.setDarkMana(0);
		value.setLightMana(0);
		value.setAnyMana(1);

		setAbilityName("Nobility");
		setAbilityDesc("Increase attack points by 1 for 1 Light mana.");
		
	}

}
