class Solution {
    public int findDuplicate(int[] nums) {
        // int ans;
        int n = nums.length;
        int i = 0;
        while(i<n){
            int c = nums[i] - 1;
            if(nums[i]!=nums[c]){
                swap(nums,i,c);
            }else{
                i++;
            }
        }
        for(int index = 0;index<n;index++){
            if(nums[index] != index + 1){
                return nums[index];
            }
        }
        return -1;
    }
    void swap(int[] nums,int i,int c){
        int temp  = nums[i];
        nums[i] = nums[c];
        nums[c] = temp;
    }
}