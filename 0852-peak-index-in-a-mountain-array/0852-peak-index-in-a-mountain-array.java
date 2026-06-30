class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return max(arr);
    }
    static int max(int[] arr){
        int max = arr[0];
        int maxindex = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
}