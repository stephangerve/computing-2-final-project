//MonsterDatabase.java
package Cards;
import Cards.MonsterCards.*;
import CardProperties.*;
import java.util.*;

public class MonsterDatabase extends CardDatabase{

	int 	fireCount,	
		waterCount,
		earthCount,
		darkCount,
		lightCount,
		goldCount,
		silverCount,
		bronzeCount;
	public void constructDatabase(){

		DB.add(new Alien());
		DB.add(new Archangel());
		DB.add(new Basilisk());
		DB.add(new Cerberus());
		DB.add(new Chimera());
		DB.add(new Cyborg());
		DB.add(new Demon());
		DB.add(new Dragon());
		DB.add(new Elf());
		DB.add(new Fairy());
		DB.add(new Goblin());
		DB.add(new Golem());
		DB.add(new Hydra());
		DB.add(new Imp());
		DB.add(new Inferno());
		DB.add(new Kirin());
		DB.add(new Kitsune());
		DB.add(new Kraken());
		DB.add(new Leprechaun());
		DB.add(new Leviathan());
		DB.add(new Mage());
		DB.add(new Mecha());
		DB.add(new Megalodon());
		DB.add(new Mermaid());
		DB.add(new Minotaur());
		DB.add(new Ogre());
		DB.add(new Paladin());
		DB.add(new Pegasus());
		DB.add(new Phoenix());
		DB.add(new SeaSerpent());
		DB.add(new TyrannosaurusRex());
		DB.add(new Thunderbird());
		DB.add(new Vampire());
		DB.add(new Werewolf());
		DB.add(new Wizard());
		DB.add(new Wyvern());
		DB.add(new Zombie());
		
		for(Card i: DB){
			if(((Monster) i).elementType.getElementType() == "Fire"){
				fireCount++;
			}
			else if(((Monster) i).elementType.getElementType() == "Water"){
				waterCount++;
			}
			else if(((Monster) i).elementType.getElementType() == "Earth"){
				earthCount++;
			}
			else if(((Monster) i).elementType.getElementType() == "Dark"){
				darkCount++;
			}
			else if(((Monster) i).elementType.getElementType() == "Light"){
				lightCount++;
			}	
		}
		for(Card i: DB){
			if(((Monster) i).monsterLevel.getMonsterLevel() == "Gold"){
				goldCount++;
			}
			else if(((Monster) i).monsterLevel.getMonsterLevel() == "Silver"){
				silverCount++;
			}
			else if(((Monster) i).monsterLevel.getMonsterLevel() == "Bronze"){
				bronzeCount++;
			}	
		}
		



	}
	public int getFireCount(){
		return this.fireCount;
	}
	public int getWaterCount(){
		return this.waterCount;
	}
	public int getEarthCount(){
		return this.earthCount;
	}
	public int getDarkCount(){
		return this.darkCount;
	}
	public int getLightCount(){
		return this.lightCount;
	}
	public int getGoldCount(){
		return this.goldCount;
	}
	public int getSilverCount(){
		return this.silverCount;
	}
	public int getBronzeCount(){
		return this.bronzeCount;
	}











}
