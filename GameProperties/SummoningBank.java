package GameProperties;
import CardProperties.*;
import java.util.*;



public class SummoningBank extends BankPoints{


		
	public SummoningBank(){


	}
	public void deposit(Card d){
		this.addGoldCoins(d.value.getGoldCoins());
		this.addSilverCoins(d.value.getSilverCoins());
		this.addBronzeCoins(d.value.getBronzeCoins());
		this.addFireMana(d.value.getFireMana());
		this.addWaterMana(d.value.getWaterMana());
		this.addEarthMana(d.value.getEarthMana());
		this.addDarkMana(d.value.getDarkMana());
		this.addLightMana(d.value.getLightMana());
		this.addAnyMana(d.value.getAnyMana());
	}
	public void withdraw(Card w){
		this.addGoldCoins(-w.cost.getGoldCoins());
                this.addSilverCoins(-w.cost.getSilverCoins());
                this.addBronzeCoins(-w.cost.getBronzeCoins());
                this.addFireMana(-w.cost.getFireMana());
                this.addWaterMana(-w.cost.getWaterMana());
                this.addEarthMana(-w.cost.getEarthMana());
                this.addDarkMana(-w.cost.getDarkMana());
                this.addLightMana(-w.cost.getLightMana());
                this.addAnyMana(-w.cost.getAnyMana());
	

	}
	public void getBankInfo(){
		System.out.print("G:" + getGoldCoins() + " ");
		System.out.print("S:" + getSilverCoins() + " ");
		System.out.print("B:" + this.getBronzeCoins() + " ");
		System.out.print("f:" + getFireMana() + " ");
        	System.out.print("w:" + getWaterMana() + " ");
        	System.out.print("e:" + this.getEarthMana() + " ");
        	System.out.print("d:" + this.getDarkMana() + " ");
        	System.out.print("l:" + getLightMana() + " ");
        	System.out.print("u:" + getAnyMana() + " ");
	}



}
