import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {

    public static void main(String[] args) {

        displayWelcomeMessage();
        checkHardcodedPalindrome();              // UC2
        checkPalindromeUsingLoop();              // UC3
        checkPalindromeUsingCharArray();         // UC4
        checkPalindromeUsingStack();             // UC5
        checkPalindromeUsingQueueAndStack();     // UC6
        checkPalindromeUsingDeque();             // UC7
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

        if (word.equals(reversed))
            System.out.println("UC2: " + word + " is a Palindrome");
        else
            System.out.println("UC2: " + word + " is NOT a Palindrome");
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

        if (original.equals(reversed))
            System.out.println("UC3: " + original + " is a Palindrome");
        else
            System.out.println("UC3: " + original + " is NOT a Palindrome");
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

        if (isPalindrome)
            System.out.println("UC4: " + input + " is a Palindrome");
        else
            System.out.println("UC4: " + input + " is NOT a Palindrome");
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

        if (isPalindrome)
            System.out.println("UC5: " + input + " is a Palindrome");
        else
            System.out.println("UC5: " + input + " is NOT a Palindrome");
    }

    // =========================
    // UC6 - Queue + Stack
    // =========================
    public static void checkPalindromeUsingQueueAndStack() {

        String input = "madam";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("UC6: " + input + " is a Palindrome");
        else
            System.out.println("UC6: " + input + " is NOT a Palindrome");
    }

    // =========================
    // UC7 - Deque Based Optimized
    // =========================
    public static void checkPalindromeUsingDeque() {

        String input = "rotator";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("UC7: " + input + " is a Palindrome");
        else
            System.out.println("UC7: " + input + " is NOT a Palindrome");
    }
}