// Aaron Prince Anu

class diamondString{
    public static void main(String[] args) {
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.print("\nEnter a word (or type 'exit' to quit): ");
            String input = In.getString(); // read input from user

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("\nExiting... \n");
                shouldContinue = false;
            } else if (input.length() > 10) {
                System.out.println("\nInput word is too long. Please enter another word.\n");
            } else {
                printDiamondPattern(input);
            }
        }
    }

    // method to print the diamond pattern
    public static void printDiamondPattern(String input) {
        int length = input.length();
        int totalRows = (length * 2) - 1; // calculate total number of rows

        int midRow = totalRows / 2; // calculate the middle row

        // iterate over each row
        for (int row = 0; row < totalRows; row++) {
            int spaces = Math.abs(midRow - row); // calculate the number of spaces before the pattern

            printSpaces(spaces);
            printPattern(input, spaces);

            System.out.println(); // move to the next line
        }
    }

    // method to print spaces
    public static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    // method to print the pattern for each row
    public static void printPattern(String input, int spaces) {
        int length = input.length();
        int patternLength = length - spaces;

        // print the left side of the pattern
        for (int j = 0; j < patternLength; j++) {
            System.out.print(input.charAt(j));
        }

        // print the right side of the pattern
        for (int j = patternLength - 2; j >= 0; j--) {
            System.out.print(input.charAt(j));
        }
    }
}