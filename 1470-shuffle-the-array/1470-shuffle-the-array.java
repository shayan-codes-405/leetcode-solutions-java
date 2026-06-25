class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int c=0; //This counter will se the empty space
        for(int i=0;i<n;i++){
            ans[c] = nums[i]; // Xpart code C is the empty space and nums[i] means x1x2x3... so i = 0 1 2 ...
            ans[c+1] = nums[i+n]; //Y part c is the next empty space storing answer and y1y2y3 comes in index afetr n so that is n and i x all index
            c += 2; //Increase count because 2 space have consume
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna