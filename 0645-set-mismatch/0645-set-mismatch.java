class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int i = 0;
        while(i < n){
            int c = arr[i] - 1;
            if(arr[i] != arr[c]){
                swap(arr,i,c);
            }else{
                i++;
            }
        }
        for(int index = 0 ; index < n; index++){
            if(arr[index] != index+1){
                ans[0] = arr[index];
                ans[1] = index+1;
            }
        }
        return ans;
    }

    static void swap(int[] arr,int i,int c){
        int temp  = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}