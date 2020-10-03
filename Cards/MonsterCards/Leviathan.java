//Leviathan.java
package Cards.MonsterCards;
import CardProperties.*;
import GameProperties.*;
import java.util.*;



public class Leviathan extends Monster{
	
	public Leviathan(){
		super("Leviathan", "Gold", "Water", 28, 20, 25, 7);	
		cost.setGoldCoins(1);
		cost.setBronzeCoins(1);
		cost.setWaterMana(2);
		value.setSilverCoins(1);
		value.setWaterMana(2);
	}

}
