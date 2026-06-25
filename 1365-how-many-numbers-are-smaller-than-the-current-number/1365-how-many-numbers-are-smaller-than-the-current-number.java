class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){ // for every elemnt it will work
            int c = 0;
            for(int j = 0;j<nums.length;j++){ // 
                if(nums[j]<nums[i]){
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna