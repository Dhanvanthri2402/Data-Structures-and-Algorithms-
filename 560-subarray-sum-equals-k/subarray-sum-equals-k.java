class Solution {
    public int subarraySum(int[] nums, int k) {
        int cur = 0;
        int co = 0;
        HashMap<Integer,Integer> result = new HashMap<>();
        result.put(0,1);

        for(int i = 0;i<nums.length;i++){
            cur+=nums[i];
            int rem = cur -k;
            if(result.containsKey(rem)){
                co+=result.get(rem);
            }
            result.put(cur,result.getOrDefault(cur,0)+1);
        }
        return co;
    }
}