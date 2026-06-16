class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int val = 0;
        for(int i=0; i<nums.length; i++) {
           if(count == 0) {
            val = nums[i];
           }

           if(val == nums[i]) {
            count++;
           } else {
            count--;
           }
        }
        
        return val;
    }
}