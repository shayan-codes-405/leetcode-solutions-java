class Solution {
    public static String convertToTitle(int columnNumber) { 
        StringBuilder sb = new StringBuilder(); 
        
        // Loop until the column number becomes 0
        while (columnNumber > 0) { 
            // Convert to 0-indexed system to handle Excel boundaries (like 'Z')
            columnNumber--; 
            
            // Find the remainder to determine the current character (0 = A, 1 = B, ..., 25 = Z)
            int rem = columnNumber % 26; 
            
            // Convert the remainder into its corresponding uppercase ASCII character
            char ch = (char)('A' + rem); 
            
            // Append the character to the builder (built from right to left)
            sb.append(ch); 
            
            // Move to the next digit position by dividing by 26
            columnNumber = columnNumber / 26; 
        } 
        
        // Reverse the string since characters were gathered from last to first
        sb.reverse(); 
        
        // Convert StringBuilder to a standard String and return it
        return sb.toString(); 
    }

}