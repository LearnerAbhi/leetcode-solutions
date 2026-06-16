class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] == target) {
        //         return i;
        //     }
        // }

        int si = 0;
        int ei = nums.length-1;
        while(si<=ei) {
            int mid = si + (ei-si)/2;
            if(target == nums[mid]) {
                return mid;
            } else if(target > nums[mid]) {
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }

        return -1;
    }
}