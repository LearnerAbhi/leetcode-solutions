class Solution {
    public void rotate(int[] nums, int k) {
        // for(int i=0; i<k; i++) {
        //     int ele = nums[nums.length-1];
        //     for(int j=nums.length-1; j>0; j--) {
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = ele;
        // }


        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse(int[] nums, int left, int right){
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}