import java.util.*;
class Solution {
public String minWindow(String s, String t) {

    HashMap<Character, Integer> map = new HashMap<>();
	
    
    //  Record the characters of string t into map
    for(int i = 0; i < t.length(); i++) {
        char ch = t.charAt(i);
        int def = map.getOrDefault(ch, 0);
        map.put(ch, def+1);
    }
    
    int count = map.size();
    String ans = "";
    int min = Integer.MAX_VALUE;
    int i = 0, j = 0;
    while(j < s.length()) {
        char ch = s.charAt(j);
        
        if(map.containsKey(ch)) {
            map.put(ch, map.get(ch)-1);
            if(map.get(ch) == 0) {count--;}   
            if(count == 0) {
			// count  == 0 represents the substring contains all the characters of string t
	            while(count == 0) {
	            	if(j-i+1 < min) {
	            		ans = s.substring(i, j+1);
	            		min = j-i+1;
	            	}
	                	                 
	                char ch_i = s.charAt(i);
	                if(map.containsKey(ch_i)) {
	                    map.put(ch_i, map.get(ch_i)+1);
	                    if(map.get(ch_i) == 1) {count++;}    
	                } 
	                i++;
	             }        
            }
        }          
       
	   j++;        
        
    }             
    return ans;        
}
}
