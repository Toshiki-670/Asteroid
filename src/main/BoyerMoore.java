package main;

import lib.Asteroid;

public class BoyerMoore {
	public static void main(String[] args){
    	//BM Search
    	String text   = "acbbcabycabcbbacb";
    	String pattern = "cabcbb";
    	int result;
    	
    	result = Asteroid.searchString(text, pattern);
    	
    	if(result >= 0){
    		System.out.println(text);
    		System.out.print(Asteroid.repeat(" ", result));
    		System.out.println(pattern);
    		
    		String out = "It matched ";
    		out += Asteroid.addTh(result + 1);
    		
    		System.out.println(out);
    	}else{
    		System.out.println("No match found...");
    	}
    }
}
