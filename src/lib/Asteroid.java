package lib;

public class Asteroid {
    
    public static String addTh(int num){
    	switch(num % 10 + 1){
		case 1:return num + "st.";
		case 2:return num + "nd.";
		case 3:return num + "rd.";
		default:return num + "th.";
		}
    }
    
    public static String repeat(String str, int rep){
    	String out = "";
    	for(int i = 0; i < rep; i++)
    		out += str;
    	return out;
    }
    
    
    public static String reverse(String str){
    	String out= "";
    	for(int i = str.length() - 1; i >= 0; i--){
    		out += str.charAt(i);
    	}
    	return out;
    }
    
}
