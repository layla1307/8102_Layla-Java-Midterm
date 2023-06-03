package string_problems;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here

        public static boolean isAnagram(String str1, String str2) {

            String s1 = str1.toLowerCase().replaceAll("\\s", "");
            String s2 = str2.toLowerCase().replaceAll("\\s", "");

            if (str1.length() != str2.length()) {
                return false;
            }
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String str1 = "CAT";
            String str2 = "ACT";
            boolean isAnagram1 = isAnagram(str1, str2);
            System.out.println(str1 + " and " + str2 + " are anagrams? " + isAnagram2);

            String str3 = "ARMY";
            String str4 = "MARY";
            boolean isAnagram2 = isAnagram(str3, str4);
            System.out.println(str3 + " and " str4 + " are anagrams? " + isAnagram2);

            String str5 = "FART";
            String str6 = "RAFT";
            boolean isAnagram3 = isAnagram(str5, str6);
            System.out.println(str5 + " and " + str6 + " are anagrams? " + isAnagram3);

        }
}
