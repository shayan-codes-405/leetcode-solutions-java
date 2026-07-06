class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
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
            if(index+1 != nums[index]){
                ans.add(index+1);
            }
        }
        return ans;
    }
    void swap(int[] arr,int i , int c){
        int temp  = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}