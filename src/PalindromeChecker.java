import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

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

        // UC5
        checkPalindromeUsingStack();

        // UC6
        checkPalindromeUsingQueueAndStack();
    }

    // =========================
    // UC1 - Welcome Message
    // =========================
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to Palindrome Checker App");
        System.out.println("----------------------------------");
    }

    // =========================
    // UC2 - StringBuilder Reverse
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

    // =========================
    // UC5 - Stack Based
    // =========================
    public static void checkPalindromeUsingStack() {

        String input = "refer";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC5: " + input + " is a Palindrome");
        } else {
            System.out.println("UC5: " + input + " is NOT a Palindrome");
        }
    }

    // =========================
    // UC6 - Queue + Stack Based
    // =========================
    public static void checkPalindromeUsingQueueAndStack() {

        String input = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);    // FIFO
            stack.push(ch);   // LIFO
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC6: " + input + " is a Palindrome");
        } else {
            System.out.println("UC6: " + input + " is NOT a Palindrome");
        }
    }
}