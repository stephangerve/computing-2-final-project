//Zone.java
package GameProperties.Zones;
import CardProperties.*;
import java.util.*;



public abstract class Zone{

	Vector<Card> zoneVector;
	
       
	public Zone(int capacity){
	       	zoneVector = new Vector<Card>(capacity);
	}
	public Zone(){
		zoneVector = new Vector<Card>();
	}
	
	public Card get(int index){
		return zoneVector.get(index);
	}
	public int lastIndexOf(Card iCard){
		return zoneVector.lastIndexOf(iCard);
	}
	public int count(){
		return zoneVector.size();
	}
	public int MAX(){
		return zoneVector.capacity();
	}
	public boolean isEmpty(){
		/*if(zoneVector.size() == 0){
			return true;
		}
		return false;*/
		return zoneVector.isEmpty();
	
	}
	public Card lastCard(){
		return zoneVector.lastElement();
	}
	public Card transferCard(int index){
		Card tCard = zoneVector.get(index);
		zoneVector.remove(index);
		return tCard;

	}
	public void addCard(Card aCard){
		zoneVector.add(aCard);
	}
	// which is worst: Clone vector, sort, it, and use binarySearch or iterative search
	public boolean contains(String eName){
		for(int i = 0; i < zoneVector.size(); i++){
			if(zoneVector.get(i).cardName.getName() == eName){
				return true;
			}
		}
		return false;
		//if(Collections.binarySearch(zoneVector, )){}
	}
	public void remove(int index){
		zoneVector.remove(index);
	}
	/*public void shuffle(){
		Collections.shuffle(zoneVector);	
	}*/
	public abstract void show();
	//public abstract void discard(Zone);
	
	/*public boolean containsCard(String eName){
		for(int i = 0; i < zoneVector.size(); i++){
			if(zoneVector.get(i).cardName.getName() == eName){
				return true;
			}
		}
		return false;
	
	}
	public boolean containsCardType(String cCardType){
		for(int i = 0; i < zoneVector.size(); i++){
			if(zoneVector.get(i).cardType.getCardType() == cCardType){
				return true;
			}
		}
		return false;
	
	}

	public boolean containsElementType(String cElementType){
		for(int i = 0; i < zoneVector.size(); i++){
			if(zoneVector.get(i).elementType.getElementType() == cElementType){
				return true;
			}
		}
		return false;
	
	}
	public boolean containsLevel(String cLevel){
		for(int i = 0; i < zoneVector.size(); i++){
			if(zoneVector.get(i).cardType.getCardType() == "Monster"){
				if(zoneVector.((Monster) get(i)).monsterLevel.getLevel() == eLevel){
					return true;
				}
			}
		}
		return false;
	
	}*/


}
