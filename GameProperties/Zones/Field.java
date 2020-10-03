//Field.java
package GameProperties.Zones;
import CardProperties.*;
import java.util.*;

public class Field extends Zone{

	int monsterCapacity = 5;
	int monsterCount = 0;
	public Field(){
		super(7);
	}
	public void addCard(Card aCard){
		if(aCard.cardType.getCardType() == "Monster"){
			monsterCount++;
		}
		zoneVector.add(aCard);
	}
	public void show(){
		System.out.println();
    		System.out.print("   ");
       	 	for(int i = 0; i < this.count(); i++){
			System.out.print(i + 11 + ".");
            		System.out.print(get(i).cardName.getName());
			if(this.get(i).cardType.getCardType() == "Monster"){
            			System.out.print("(" + ((Monster) this.get(i)).atk.getCriticalHit() + ",");
            			System.out.print(((Monster) this.get(i)).def.getCriticalHit() + ",");
           		 	System.out.print(((Monster) this.get(i)).monsterHP.getActualHP() + ")");
           		 }
		System.out.print("\t");
		}
			System.out.println();
	}
	public int getMonsterCount(){
		return monsterCount;		
	}



}
