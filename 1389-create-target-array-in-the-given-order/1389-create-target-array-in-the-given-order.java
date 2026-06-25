class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = list.get(i);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna