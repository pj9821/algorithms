class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            if(map.containsKey(i))map.put(i,map.get(i)+1);
            else map.put(i,1);
        }
        // making a min priority queue based on the (value)frequency of the key
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->map.get(n1)-map.get(n2));
        for(int i:map.keySet())
        {
            pq.add(i);
            // only maintaining k elements in the pq
            if(pq.size()>k)pq.remove();
        }
        int output[] = new int[k];
        for(int i =k-1;i>=0;i--)
        {
            output[i] = pq.remove();
        }
        return output;
            
    }
}
