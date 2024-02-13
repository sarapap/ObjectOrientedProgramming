package Module5.JUnitTests;

public class StringManipulator {
    public String concantenate(String str1, String str2) {
        return str1 + str2;
    }

    public int findLength(String str) {
        return str.length();
    }

    public String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    public String convertToLowerCase(String str) {
        return str.toLowerCase();
    }

    public boolean containsSubstring(String str, String subStr) {
        return str.contains(subStr);
    }

    public static void main(String[] args) {
        StringManipulator sm = new StringManipulator();
        System.out.println(sm.concantenate("Apple", " Banana"));
        System.out.println(sm.findLength("Banana"));
        System.out.println(sm.convertToUpperCase("Apple"));
        System.out.println(sm.convertToLowerCase("Apple"));
        System.out.println(sm.containsSubstring("Apple or Banana", "Banana"));
    }
}
