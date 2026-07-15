class Solution {
    public boolean isLongPressedName(String name, String typed) {

        int i = 0;
        int j = 0;

        while (i < name.length() && j < typed.length()) {

            // Characters match
            if (name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            }

            // Extra repeated character in typed (long press)
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            }

            // Invalid character
            else {
                return false;
            }
        }

        // Name should be completely matched
        if (i != name.length()) {
            return false;
        }

        // Remaining typed characters (if any) must be repeats
        while (j < typed.length()) {

            if (typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }

            j++;
        }

        return true;
    }
}