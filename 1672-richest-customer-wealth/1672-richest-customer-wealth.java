class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] arr: accounts){
        int sum = 0;
            for(int val:arr){
                sum = sum + val;
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna