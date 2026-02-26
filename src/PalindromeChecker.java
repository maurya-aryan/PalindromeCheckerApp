public class PalindromeChecker {

    public static void main(String[] args) {

        // UC1
        displayWelcomeMessage();

        // UC2
        checkHardcodedPalindrome();

        // UC3
        checkPalindromeUsingLoop();

        // UC4
        checkPalindromeUsingCharArray();
    }

    // =========================
    // UC1 - Welcome Message
    // =========================
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------------------------");
    }

    // =========================
    // UC2 - Hardcoded Palindrome (StringBuilder)
    // =========================
    public static void checkHardcodedPalindrome() {

        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("UC2: " + word + " is a Palindrome");
        } else {
            System.out.println("UC2: " + word + " is NOT a Palindrome");
        }
    }

    // =========================
    // UC3 - Reverse Using Loop
    // =========================
    public static void checkPalindromeUsingLoop() {

        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println("UC3: " + original + " is a Palindrome");
        } else {
            System.out.println("UC3: " + original + " is NOT a Palindrome");
        }
    }

    // =========================
    // UC4 - Character Array + Two Pointer
    // =========================
    public static void checkPalindromeUsingCharArray() {

        String input = "level";
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC4: " + input + " is a Palindrome");
        } else {
            System.out.println("UC4: " + input + " is NOT a Palindrome");
        }
    }
}