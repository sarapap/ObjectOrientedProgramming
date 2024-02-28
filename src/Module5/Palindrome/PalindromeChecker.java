package Module5.Palindrome;

public class PalindromeChecker {
    public boolean isPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i<j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        } return true;
    }
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        System.out.println(checker.isPalindrome("radar"));
        System.out.println(checker.isPalindrome("raidar"));
        System.out.println(checker.isPalindrome("hello"));
        System.out.println(checker.isPalindrome("openai"));
        System.out.println(checker.isPalindrome("abba"));
    }
}
