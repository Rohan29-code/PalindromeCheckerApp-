import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;

        if (str.charAt(start) != str.charAt(end)) return false;

        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}