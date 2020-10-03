//Message.java
package GameProperties;
import java.util.*;

public class Message extends Exception{

	HashMap<String, String> hm;
	String code, specifier;
	String f = "\n\n-> ";
	int num;
	
	public String getMessage(){
		if(num == 1){
			return f + code + hm.get(specifier);
		}
		if(num == 2){
			return f + hm.get(code) + hm.get(specifier);
		}
		return "default";
	}
	public Message(int num, String code, String specifier){
		this.code = code;
		this.specifier = specifier;
		this.num = num;
		hm = new HashMap<String, String>();
		hm.put("sumnot","Cannot summon. ");
		hm.put("maxip", "Maximum number of cards allowed in play reached (7). ");
		hm.put("summon", " is summoned to field!");
		hm.put("insubp", " Insufficient bank points.");
		hm.put("banked", " has been banked.");
		hm.put("maxmp", "Maximum number of monster cards allowed in play reached (5). ");
		hm.put("dcard", " has been discarded.");
		hm.put("drawnt", "Cannot draw. ");
		hm.put("maxih", "Maximum number of cards allowed in hand reached (7). ");
		hm.put("draw", " has been added to your hand. ");
		hm.put("ientry", "Invalid entry. Try again.");
	}
	public String toString(){
		return getMessage();
	}





}
