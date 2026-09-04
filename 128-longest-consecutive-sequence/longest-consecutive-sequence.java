class Solution {
    public int longestConsecutive(int[] nums) {
        int c = 1;
        int l = 1;
        Arrays.sort(nums);
        if(nums.length==0) {
            return 0;
        }
        for(int i =1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    c++;
                }
                else{
                    l = Math.max(c,l);
                    c=1;
                }
            }
            l = Math.max(c,l);
        }
        return l;
    }
}