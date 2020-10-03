package CardProperties;
import java.util.*;



public class BankPoints{

	
	 int	goldCoins = 0,
		silverCoins = 0,
		bronzeCoins = 0,
		fireMana = 0,
		waterMana = 0,
		earthMana = 0,
		darkMana = 0,
		lightMana = 0,
		anyMana = 0;

	public void printBankPoints(){
		if(goldCoins > 0){
	    		System.out.print(goldCoins + " gold coin(s) ");
	        }
	    	if(silverCoins > 0){
	    		System.out.print(silverCoins + " silver coin(s) ");
	        }
	    	if(bronzeCoins > 0){
	    		System.out.print(bronzeCoins + " bronze coin(s) ");
	        }
	    	if(fireMana > 0){
	    		System.out.print(fireMana + " fire mana ");
	        }
	   	if(waterMana > 0){
	    		System.out.print(waterMana + " water mana ");
	    	}
	    	if(earthMana > 0){
	    		System.out.print(earthMana + " earth mana ");
	    	}
	    	if(darkMana > 0){
	    		System.out.print(darkMana + " dark mana ");
	    	}
	    	if(lightMana > 0){
	    		System.out.print(lightMana + " light mana ");
	   	}
	    	if(anyMana > 0){
	    		System.out.print(anyMana + " any other mana ");
	    	}
	}
	public void setGoldCoins(int goldCoins){
		this.goldCoins = goldCoins;
	}
	public void setSilverCoins(int silverCoins){
		this.silverCoins = silverCoins;		
	}
	public void setBronzeCoins(int bronzeCoins){
		this.bronzeCoins = bronzeCoins;
	}
	public void setFireMana(int fireMana){
		this.fireMana = fireMana;
	}
	public void setWaterMana(int waterMana){
		this.waterMana = waterMana;
	}
	public void setEarthMana(int earthMana){
		this.earthMana = earthMana;
	}
	public void setDarkMana(int darkMana){
		this.darkMana = darkMana;
	}
	public void setLightMana(int lightMana){
		this.lightMana = lightMana;
	}
	public void setAnyMana(int anyMana){
		this.anyMana = anyMana;
	}

	public int getGoldCoins(){
		return this.goldCoins;
	}
	public int getSilverCoins(){
		return this.silverCoins;
	}
	public int getBronzeCoins(){
		return this.bronzeCoins;
	}
	public int getFireMana(){
		return this.fireMana;
	}
	public int getWaterMana(){
		return this.waterMana;
	}
	public int getEarthMana(){
		return this.earthMana;
	}
	public int getDarkMana(){
		return this.darkMana;
	}
	public int getLightMana(){
		return this.lightMana;
	}
	public int getAnyMana(){
		return this.anyMana;
	}

	public void addGoldCoins(int goldCoins){
                this.goldCoins += goldCoins;
        }
        public void addSilverCoins(int silverCoins){
                this.silverCoins += silverCoins;
        }
        public void addBronzeCoins(int bronzeCoins){
                this.bronzeCoins += bronzeCoins;
        }
        public void addFireMana(int fireMana){
                this.fireMana += fireMana;
        }
        public void addWaterMana(int waterMana){
                this.waterMana += waterMana;
        }
        public void addEarthMana(int earthMana){
                this.earthMana += earthMana;
        }
        public void addDarkMana(int darkMana){
                this.darkMana += darkMana;
        }
        public void addLightMana(int lightMana){
                this.lightMana += lightMana;
        }
        public void addAnyMana(int anyMana){
                this.anyMana += anyMana;
        }
	



	




}
