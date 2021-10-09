class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current_petrol=0;
	    int previous_petrol=0;
	    int start=0;
	    for(int i=0;i<gas.length;i++){
	        current_petrol+=gas[i]-cost[i];
	        if(current_petrol<0){
	            start=i+1;
	            previous_petrol+=current_petrol;
	            current_petrol=0;
	        }
	        
         }
         return ((current_petrol+previous_petrol)>=0)?(start):-1;  
    }
}
