package GameProperties;
import java.util.*;


public class Stats{

	int wins, losses;
	public Stats(){
		wins = 0;
		losses = 0;
	}

	public int getWins(){
		return wins;
	}
	public int getLosses(){
		return losses;
	}
	public void increWins(){
		wins++;
	}
	public void increLosses(){
		losses++;
	}


}
