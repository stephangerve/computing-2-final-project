//Graveyard.java
package GameProperties.Zones;
import java.util.*;

public class Graveyard extends Zone{

	public void show(){
		for (int i = 0; i < this.count(); i++){
			System.out.print("\t" + i + 1  + "." + this.get(i).cardName.getName());
			System.out.println();
				}
	}



}
