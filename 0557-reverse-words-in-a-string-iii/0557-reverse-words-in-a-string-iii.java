class Solution {
    public String reverseWords(String s) {
        String[] sp = s.split(" ");
        for(int i = 0;i<sp.length;i++){
            StringBuilder rev = new StringBuilder("");
            for(int j = sp[i].length()-1;j>=0;j--){
                rev.append(sp[i].charAt(j));
            }
            sp[i] = rev.toString();
        }
        String st = String.join(" ",sp);

        return st;
    }
}