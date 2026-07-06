class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    void swap(int[] arr,int i,int c){
        int temp  = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}