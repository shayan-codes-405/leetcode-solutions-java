class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int cur = 0;
        for(int i : gain){
            cur = cur + i;
            if(cur>high){
                high=cur;
            }
        }
        return high;
    }
}