import java.util.*;


class MyException extends Exception{

	HashMap<String, String> hm = new HashMap<String, String>();
	String msg = "This is a message";
	String m;
	//hm.put("message", msg);
//	hm.put("bad", "This is a bad message");

	String message(String m){
		return hm.get(m);
	}
	MyException(String m){
		this.m = m;
		hm.put("message", msg);	
	}
	public String toString(){
		return message(m);
	}


}
