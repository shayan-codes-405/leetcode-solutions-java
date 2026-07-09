class Solution {
    public int hIndex(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<=r){
            int mid = l + (r-l) / 2;
            if(nums[mid] >= n - mid){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return n-l;
    }
}