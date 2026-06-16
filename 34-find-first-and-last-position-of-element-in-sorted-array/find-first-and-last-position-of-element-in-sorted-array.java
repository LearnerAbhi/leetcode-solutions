class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            searchLeft(nums, target),
            searchRight(nums, target)
        };
    }

    private int searchLeft(int[] nums, int target) {
        int si=0; int ei=nums.length-1; int ans=-1;
        while(si<=ei) {
            int mid = si + (ei-si)/2;
            if(target == nums[mid]) {
                ans = mid;
                ei = mid-1;
            } else if(target > nums[mid]) {
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }
        return ans;
    };

    private int searchRight(int[] nums, int target) {
        int si=0; int ei=nums.length-1; int ans=-1;
        while(si<=ei) {
            int mid = si + (ei-si)/2;
            if(target == nums[mid]) {
                ans = mid;
                si = mid+1;
            } else if(target > nums[mid]) {
                si = mid+1;
            } else {
                ei = mid-1;
            }
        }
        return ans;
    }
}