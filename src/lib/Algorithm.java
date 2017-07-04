package lib;

public class Algorithm {
	
	public static int checkDigitForPaiza(String instr){
		StringBuffer sb = new StringBuffer(instr);
		String str = sb.reverse().toString();
		
		int even = 0;
		int odd = 0;
		for(int j = 1; j < str.length(); j++){
			int temp = Integer.parseInt("" + str.charAt(j));
			if((j + 1) % 2 == 0){
				temp *= 2;
				temp = temp / 10 + temp % 10;
				even += temp;
			}else{
				odd += temp;
			}	
		}
		return (10 - ((even + odd) % 10))% 10;
	}
	
	
	

}
