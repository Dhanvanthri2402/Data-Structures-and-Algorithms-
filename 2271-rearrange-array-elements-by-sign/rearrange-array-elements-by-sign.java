class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int [] num = new int[nums.length];
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]<0){
                num[n]=nums[i];
                n+=2;
            }
            else{
                num[p] = nums[i];
                p+=2;
            }
        }
        return num;
    }
}