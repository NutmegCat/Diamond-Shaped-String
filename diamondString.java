public class diamondString {
    public static void main(String[] args) {
        while (true) {
            System.out.print("\nEnter a word (or type 'exit' to quit): \n");
            String input = In.getString();

            if (input.equalsIgnoreCase("exit")) break;
            if (input.length() > 10) { System.out.println("\nInput word is too long. Please enter another word.\n"); continue; }

            int n = input.length() * 2 - 1, m = n / 2;

            for (int i = 0; i < n; i++) {
                int spaces = Math.abs(m - i);
                System.out.print(" ".repeat(spaces));
                System.out.print(input.substring(0, input.length() - spaces));
                System.out.print(new StringBuilder(input.substring(0, input.length() - spaces - 1)).reverse().toString());
                System.out.println();
            }
        }
    }
}