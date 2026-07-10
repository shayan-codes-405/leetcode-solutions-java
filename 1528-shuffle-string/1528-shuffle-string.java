class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<n;i++){
            sb.append(" ");
        }

        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            int des = indices[i];
            sb.setCharAt(des,ch);
        }
        return sb.toString();
    }
}