class Solution {
    public int missingNumber(int[] nums) {
       //Using Sum Approach
       int n = nums.length;
       int sum = 0;
       for(int i = 0;i<n;i++){
        sum = sum + nums[i];
       } 
       int expSum = n*(n+1)/2;
      int  miss = expSum - sum;
       return miss;
    }
}