class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count=0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);

        for(int num: nums)
        {   prefixSum += num;
            if(hash.containsKey(prefixSum-k))
            {
                count += hash.get(prefixSum-k);
            }
            hash.put(prefixSum,hash.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
