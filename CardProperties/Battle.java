package CardProperties;
import java.util.*;



public class Battle{

	int criticalHit;
	int criticalChance;
	int normalChance = (100 - criticalChance)/5;
	boolean hasBattled;
	Vector<Integer> range;
	Random rand;
	public Battle(int criticalHit, int criticalChance){
		setCriticalHit(criticalHit);
		setCriticalChance(criticalChance);
		range = new Vector<Integer>(100);
		rand = new Random(System.currentTimeMillis());
		setRange();
	}
	public void setCriticalHit(int criticalHit){
		this.criticalHit = criticalHit;
	}
	public int getCriticalHit(){
		return criticalHit;
	}
	public void setCriticalChance(int criticalChance){
		this.criticalChance = criticalChance;
	}
	public int getCriticalChance(){
		return this.criticalChance;
	}
	public void setHasBattled(){
		hasBattled = true;
	}
	public boolean getHasBattled(){
		return hasBattled;
	}
	public void resetHasBattled(){
		hasBattled = false;
	}
	public void setRange(){
		for(int i = 0; i < criticalChance; i++){
			range.add(criticalHit);
		}
		for(int i = 0; i < normalChance; i++){
			range.add(0);
			range.add(criticalHit - 1);
			range.add(criticalHit - 2);
			range.add(criticalHit - 3);
			range.add(criticalHit - 4);
		}
	}
	public int hit(){
		setHasBattled();
		int n = rand.nextInt(range.size());
		return range.get(n);

	}



} 
