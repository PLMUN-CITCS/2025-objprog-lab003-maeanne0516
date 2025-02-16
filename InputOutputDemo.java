import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        
        // Prompt user for an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        
        // Prompt user for a decimal number (double)
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();
        
        // Consume the leftover newline character from previous inputs
        input.nextLine();  // This is important to avoid skipping string input
        
        // Prompt user for a word or sentence (string)
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();
        
        // Output the integer with formatted output
        System.out.printf("Your integer: %d%n", userInt);
        
        // Output the decimal number formatted to 2 decimal places
        System.out.printf("Your decimal number: %.2f%n", userDouble);
        
        // Output the string
        System.out.printf("Your string: %s%n", userString);
        
        // Close the scanner to release resources
        input.close();
    }
}
