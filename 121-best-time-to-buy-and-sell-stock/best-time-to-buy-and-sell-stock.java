class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]<=min){
                min = nums[i];
            }
            else{
                profit = Math.max(profit,nums[i]-min);
            }
        }
        return profit;
    }
}