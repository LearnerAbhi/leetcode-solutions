class Solution {
    public int singleNumber(int[] nums) {
        int singleOne = nums[0];
        for(int i=1; i<nums.length; i++) {
            singleOne ^= nums[i]; 
        }

        return singleOne;
    }
}