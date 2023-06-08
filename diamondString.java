class diamondString{
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = In.getString(); // Read input from user
        
        int length = input.length();
        int totalRows = (length * 2) - 1; // Calculate total number of rows
        
        int midRow = totalRows / 2; // Calculate the middle row
        
        // Iterate over each row
        for (int row = 0; row < totalRows; row++) {
            int spaces = Math.abs(midRow - row); // Calculate the number of spaces before the pattern
            
            // Print the spaces
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            
            // Print the left side of the pattern
            int leftPatternLength = length - spaces;
            for (int j = 0; j < leftPatternLength; j++) {
                System.out.print(input.charAt(j));
            }
            
            // Print the right side of the pattern
            int rightPatternLength = length - spaces - 1;
            for (int j = rightPatternLength; j >= 0; j--) {
                System.out.print(input.charAt(j));
            }
            
            System.out.println(); // Move to the next line
        }
    }
}