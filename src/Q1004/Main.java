package Q1004;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Integer> map = null;
		String color = null;
		String popular = null;
        while(s.hasNext()) {
        	int n = Integer.valueOf(s.nextLine());
        	if(n == 0) {
        	   continue;
        	}
        	map = new HashMap<>();
        	for(int i = 0;i<n;i++) {
        		color = s.nextLine();
        		if(map.containsKey(color)) {
        			map.put(color, map.get(color)+1);
        			if(map.get(popular) < map.get(color)) {
        				popular = color;
        			}
        		}else {
        			map.put(color, 1);
        			if(popular == null) {
        				popular = color;
        			}
        		}
        	}
        	System.out.println(popular);
        	popular = null;
        	map = null;
        }
    }

}