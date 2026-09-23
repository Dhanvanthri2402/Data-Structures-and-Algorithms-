class Solution {
    public int subarraySum(int[] nums, int k) {
        int cur = 0;
        int count = 0;
        Map<Integer,Integer> sum = new HashMap<>();
        sum.put(0,1);

        for(int i =0;i<nums.length;i++){
            cur += nums[i];
            int rem = cur - k;
            if(sum.containsKey(rem)){
                count+= sum.get(rem);
            }
            sum.put(cur,sum.getOrDefault(cur,0)+1);
        }
        return count;
    }
}