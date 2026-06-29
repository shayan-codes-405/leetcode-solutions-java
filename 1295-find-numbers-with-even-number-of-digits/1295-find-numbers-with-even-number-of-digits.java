class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
            for(int e : nums){
                int element = e;
                int count = 0;
                while(element > 0){
                    count++;
                    element = element / 10;
                }
                if(count % 2 == 0){
                    ans++;
                }
            }
            return ans;
    }
    public int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}