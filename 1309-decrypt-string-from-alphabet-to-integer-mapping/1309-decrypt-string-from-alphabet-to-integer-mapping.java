class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if(i + 2 < s.length()){

                if(s.charAt(i+2) == '#'){

                    int firstDigit = (s.charAt(i)) - '0';
                    int secondDigit = (s.charAt(i+1)) - '0';

                    int num = (firstDigit * 10) + secondDigit;

                    char ch = (char)('a' + (num - 1));

                    sb.append(ch);

                    i = i + 2;
            }
            else{
                int di = (s.charAt(i)) - '0';
                char ch = (char)( 'a' + (di - 1));
                sb.append(ch);

            }
                }
                else{
                int di = (s.charAt(i)) - '0';

                char ch = (char)( 'a' + (di - 1));

                sb.append(ch);
            }

        }
        return sb.toString();
    }
}