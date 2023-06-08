// Aaron Prince Anu

public class diamondString {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter a word (or type 'exit' to quit): ");
            String input = In.getString();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("\nExiting ...\n");
                break;
            } else if (input.length() > 10) {
                System.out.println("\nInput word is too long. Please enter another word.");
                continue;
            }

            int length = input.length();
            int totalRows = (length * 2) - 1;
            int midRow = totalRows / 2;

            for (int row = 0; row < totalRows; row++) {
                int spaces = Math.abs(midRow - row);
                print(" ".repeat(spaces));
                print(input.substring(0, length - spaces));
                print(new StringBuilder(input.substring(0, length - spaces - 1)).reverse().toString());
                println();
            }
        }
    }
    
    public static void print(String s) {
        System.out.print(s);
    }
    
    public static void println() {
        System.out.println();
    }
}