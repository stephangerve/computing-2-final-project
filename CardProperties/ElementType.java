package CardProperties;
import java.util.*;



public class ElementType{
	
	String elementType;
	public ElementType(String elementType){
		setElementType(elementType);

	}

	public String getElementType(){
		return elementType;
	}
	public void setElementType(String elementType){
		if(checkElementType(elementType) == true){
			this.elementType = elementType;
		}
	}
	public boolean checkElementType(String cet){
		if(cet == "Fire"){
			return true;
		}
		else if(cet == "Water"){
			return true;
		}
		else if(cet == "Earth"){
			return true;
		}
		else if(cet == "Dark"){
			return true;
		}	
		else if(cet == "Light"){
			return true;
		}
		else{
			return false;
		}
	}


}
