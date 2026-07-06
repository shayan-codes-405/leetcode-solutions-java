class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct = nums[i]; // In the range [0, n], each value belongs at the index equal to its value.
            if(nums[i] < n && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < n;index++){
            if(index!=nums[index]){
                return index;
            }
        }
        //case 2
        return n;
    }
    void swap(int[] arr,int i,int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
       //Using Sum Approach
    //    int n = nums.length;
    //    int sum = 0;
    //    for(int i = 0;i<n;i++){
    //     sum = sum + nums[i];
    //    } 
    //    int expSum = n*(n+1)/2;
    //   int  miss = expSum - sum;
    //    return miss;
