//Deck.java
package GameProperties.Zones;
import Cards.*;
import java.util.*;




public class Deck extends Zone{

	MonsterDatabase mDB;
	SpellDatabase sDB;
	Random rand;
	public Deck(){
		super(40);
		mDB = new MonsterDatabase();
		sDB = new SpellDatabase();
		rand = new Random(System.currentTimeMillis());
	}
	public void show(){
	
	}
	public void createRandomDeck(){
		int mn = 0, 
		    sn = 0;
    		
        	System.out.println();
        	for(int i = 0; i < MAX() - 15; i++){
        		mn = rand.nextInt(mDB.count());
            		addCard(mDB.get(mn));
       	 	}
		for(int i = 0; i < 15; i++){
			sn = rand.nextInt(sDB.count());
			addCard(sDB.get(sn));
		}
	}
	public void shuffle(){
		Collections.shuffle(zoneVector);
	}



} 
