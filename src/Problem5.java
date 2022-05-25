import java.util.Scanner;

/**
 * Problem 5 - Palindrome
 * Kata palindrom adalah sebuah kata yang jika dibalik, tetap sama.
 * Buatalah sebuah program untuk mengecek apakah string merupakan palindrom atau bukan.
 */

public class Problem5 {

    public static void main(String... args) {
        Problem5 problem5 = new Problem5();

        System.out.print("Input: ");
        String resultInput = problem5.generateInput();
        boolean isPalindrome = problem5.isPalindrome(resultInput);
        String result = isPalindrome ? "Palindrome" : "Bukan palindrom";
        System.out.print("Output: " + result);
    }

    private boolean isPalindrome(String text) {
        StringBuilder reverseTextBuilder = new StringBuilder();
        String[] textArr = text.split("");

        for (int i = text.length()-1; i>=0;i--) {
            reverseTextBuilder.append(textArr[i]);
        }

        String reverseText = reverseTextBuilder.toString();

        return reverseText.equalsIgnoreCase(text);
    }

    private String generateInput() {
        Scanner input = new Scanner(System.in);

        String result = input.nextLine();

        input.close();

        return result.trim();
    }

}
