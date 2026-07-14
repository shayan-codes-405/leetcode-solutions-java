class Solution {
    public int numOfStrings(String[] s, String word) {
        int c = 0;
        for(int i = 0;i<s.length;i++){
            if(word.contains(s[i])){
                c++;
            }
        }
        return c;
    }
}