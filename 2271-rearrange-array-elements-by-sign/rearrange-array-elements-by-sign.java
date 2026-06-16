class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] pos = new int[nums.length/2];
        // int ve = 0;
        // int ne = 0;
        // int[] neg = new int[nums.length/2];
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] > 0) {
        //         pos[ve++] = nums[i];                
        //     } else {
        //         neg[ne++] = nums[i];
        //     }
        // }
        // ve=0; ne=0;
        // for(int i=0; i<nums.length; i++) {
        //     if(i%2==0) {
        //         nums[i] = pos[ve++];
        //     } else {
        //         nums[i] = neg[ne++];
        //     }
        // }

        // return nums;


        int[] ans = new int[nums.length];
        int pos=0;
        int neg=1;

        for(int num : nums) {
            if(num > 0) {
                ans[pos] = num;
                pos += 2;
            } else {
                ans[neg] = num;
                neg += 2;
            }
        }

        return ans;
    }
}