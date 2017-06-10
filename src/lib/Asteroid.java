package lib;

public class Asteroid {
	
	//For searchBm
	private static void initTable(int table[], String ptn){
    	int i;
    	for(i = 0; i < table.length; i += 1)
    		table[i] = ptn.length();
    	for(i = 0; i < ptn.length(); i += 1)
    		table[(int)ptn.charAt(i)] = ptn.length() - i - 1;
    }
    //For searchBm
    private static int nextStep(int table[], char ch, int remain){
    	if(table[(int)ch] > remain)
    		return table[(int)ch];
    	return remain;
    }
    public static int searchString(String text, String pattern){
    	int[] table = new int[256];
    	initTable(table, pattern);
    	
    	int i, j;
    	i = j = pattern.length() - 1;
    	while((i < text.length()) && (j >= 0)){
    		if(text.charAt(i) != pattern.charAt(j)){
    			i += nextStep(table, text.charAt(i), pattern.length() - j);
    			j  = pattern.length() - 1;
    		}else{
    			i -= 1;
    			j -= 1;
    		}
    	}
    	if(j < 0){
    		return i + 1;
    	}
    	return -1;
    }
    
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
    	for(int i = 0; i < rep; i++){
    		out += str;
    	}
    	return out;
    }
    
    
    public static String reverse(String str){
    	String out= "";
    	for(int i = 0; i < str.length(); i++){
    		out += str.charAt(i);
    	}
    	return out;
    }
    
}
