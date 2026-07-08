class Solution {
    int pivotIndex(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n -1;
        int ans  = -1;
        if(nums[s] < nums[e]){
            return -1;
        }
        while (s<=e) {
            int mid = s + (e-s) / 2;
            if(nums[mid]<=nums[n-1]){
                // iska maatlba hum l2 wli line main hai 
                // lakin answer to l1 wli line main hai na to move to l1
                e = mid - 1;
            }else{
                
                ans  = mid; //Store the potential answer and check its right sid is the answer presenet or not 
                s = mid + 1;

            }
        }
        return ans;
    }
    int binarySearch(int nums[],int s,int e,int target){
        int n = nums.length;
        while(s<=e){
            int mid = s + (e-s) /2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                e = mid -  1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int piv = pivotIndex(nums);
        int n = nums.length;
        //if pivoted index is -1,array is already sorted
        if(piv == -1){
            int ans = binarySearch(nums,0,n-1,target);
            return ans;
        }
        else{
            //L1 wla case hai ya
            int s1 = 0;
            int e1 =piv;
            if(target >= nums[s1] && target <= nums[e1]){
                int ans = binarySearch(nums,s1,e1,target);
                return ans;
            }
            int s2 = piv+1;
            int e2 = n-1;
            if(target >= nums[s2] && target <= nums[e2]){
                int ans = binarySearch(nums,s2,e2,target);
                return ans;
            }
        }
        return -1;
    }

}