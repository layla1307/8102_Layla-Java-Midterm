package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static boolean isPalindrome(String str) {
        String reverse = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i --) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args) {
        String str "MOM";
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }

}
