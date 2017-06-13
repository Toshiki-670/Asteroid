package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import lib.Asteroid;

public class LogCheckPaiza {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tai = new String(br.readLine());
		int[] ti = ipa(tai);
		
		String nx = new String(br.readLine());
		int n = Integer.parseInt(nx);
		
		for (int i = 0; i < n; i++){
			String line = new String(br.readLine());
			String[] log =line.split("\\s+"); //Regex of Space
			int[] ip = ipb(log[0]);
			if(isOk(ti, ip)){
				String time = log[3].substring(1);
				
				System.out.println(log[0] + " " + time + " " + log[6]);
			}
			
		}
		
		
	}
	
	
	public static int hosi(int a){
		if(a == 0)return 0;
		else return 255;
	}
	
	public static boolean isOk(int[] ti, int[] ip){
		boolean out = false;
		if(ti[0] <= ip[0] && ti[1] >= ip[0] && ti[2] <= ip[1] && ti[3] >= ip[1] && ti[4] <= ip[2] && ti[5] >= ip[2] && ti[6] <= ip[3] && ti[7] >= ip[3]){
			out = true;
		}
		return out;
	}
	
	public static int[] ipa(String tai){
		int[] b = {0,0,0,0,0,0,0,0};
		b[0] = ip(tai, 0, 0);
		b[1] = ip(tai, 0, 1);
		b[2] = ip(tai, 1, 0);
		b[3] = ip(tai, 1, 1);
		b[4] = ip(tai, 2, 0);
		b[5] = ip(tai, 2, 1);
		b[6] = ip(tai, 3, 0);
		b[7] = ip(tai, 3, 1);
		return b;
	}
	
	public static int[] ipb(String tai){
		int[] b = {0,0,0,0};
		b[0] = ipb(tai, 0);
		b[1] = ipb(tai, 1);
		b[2] = ipb(tai, 2);
		b[3] = ipb(tai, 3);
		return b;
	}
	public static int ip(String a, int b , int c){
		String[] s =a.split("\\.");
		
		return oct(s[b], c);
	}
	
	public static int ipb(String a, int b){
		String[] s =a.split("\\.");
		
		return Integer.parseInt(s[b]);
	}
	
	public static int oct(String a, int b){
		if(a.charAt(0) == '*'){
			return hosi(b);
		}else if(a.charAt(0) == '['){
			if(b == 0){
				return min(a);
			}else{
				return max(a);
			}
		}else{
			return Integer.parseInt(a);
		}
	}
	
	
	public static int min(String a){
		int min;
		min = Integer.parseInt(a.substring(1, Asteroid.search(a, "-")));
		return min;
	}
	
	public static int max(String a){
		int max;
		max = Integer.parseInt(a.substring(Asteroid.search(a,"-")+1,Asteroid.search(a,"]")));
		return max;
	}
	
	
}
