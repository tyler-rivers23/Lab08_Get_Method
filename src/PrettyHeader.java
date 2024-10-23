import java.util.Scanner;

public class PrettyHeader {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your message:");
        String msg = in.nextLine();

        // Length of total line is 60 characters
        int totalWidth = 60;

        // First and third line: 60 asterisks
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line

        // Second line: "*** message ***" centered
        String border = "***";
        int contentWidth = totalWidth - (border.length() * 2); // Space available for the message
        int padding = (contentWidth - msg.length()) / 2; // Padding on each side of the message

        System.out.print(border); // Print left border
        for (int i = 0; i < padding; i++) {
            System.out.print(" "); // Padding before message
        }
        System.out.print(msg); // Print the message
        for (int i = 0; i < (contentWidth - padding - msg.length()); i++) {
            System.out.print(" "); // Padding after message
        }
        System.out.println(border); // Print right border

        // Third line: 60 asterisks again
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println(); // End with a newline
    }
}


