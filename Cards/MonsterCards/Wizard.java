//Wizard.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Wizard extends Monster{
	
	public Wizard(){
		super("Wizard", "Gold", "Dark", 19, 18, 50, 7);	
		cost.setGoldCoins(1);
		cost.setSilverCoins(0);
		cost.setBronzeCoins(0);
		cost.setFireMana(0);
		cost.setWaterMana(0);
		cost.setEarthMana(0);
		cost.setDarkMana(0);
		cost.setLightMana(0);
		cost.setAnyMana(3);

		value.setGoldCoins(0);
		value.setSilverCoins(0);
		value.setBronzeCoins(0);
		value.setFireMana(1);
		value.setWaterMana(1);
		value.setEarthMana(1);
		value.setDarkMana(1);
		value.setLightMana(1);
		value.setAnyMana(1);

		setAbilityName("Magic Potion");
		setAbilityDesc("Add 3 mana of any element to bank.");
		
	}

}
