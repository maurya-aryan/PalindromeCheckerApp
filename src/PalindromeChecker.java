public class PalindromeChecker  {

    public static void main(String[] args) {

        // UC1
        displayWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkPalindromeUsingLoop();
    }

    // =========================
    // UC1 - Welcome Message
    // =========================
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------------------------");
    }

    // =========================
    // UC2 - Hardcoded Palindrome (Using StringBuilder)
    // =========================
    public static void checkHardcodedPalindrome() {

        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("UC2 Result: " + word + " is a Palindrome");
        } else {
            System.out.println("UC2 Result: " + word + " is NOT a Palindrome");
        }
    }

    // =========================
    // UC3 - Palindrome Using Loop Reverse
    // =========================
    public static void checkPalindromeUsingLoop() {

        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("UC3 Result: " + original + " is a Palindrome");
        } else {
            System.out.println("UC3 Result: " + original + " is NOT a Palindrome");
        }
    }
}