class Solution {
    public int removeDuplicates(int[] nums) {
        int si = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[si] != nums[i]) {
                si++;
            }
            nums[si] = nums[i];
        }

        return ++si;
    }
}