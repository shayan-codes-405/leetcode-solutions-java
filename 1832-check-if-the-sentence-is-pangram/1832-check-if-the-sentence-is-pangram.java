class Solution {
    public boolean checkIfPangram(String s) {
        int[] mark = new int[26];
        for(int i =0;i<s.length();i++){
        int index = 0;
            char ch = s.charAt(i);
            index = ch - 'a';
            mark[index] = 1;
        }
        for(int i=0;i<mark.length;i++){
            if(mark[i]==0){
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna