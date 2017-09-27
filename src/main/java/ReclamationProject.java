/**
 * Contains a function to find the longest common substring of two strings.
 */
public class ReclamationProject {

    /**
     * Finds the longest common substring (the longest set of characters that input1 and input2 have
     * in common.
     *
     * @param input1 the first string to compare
     * @param input2 the second string to compare
     * @return the longest common substring between input1 and input2
     */
    static String doit(final String input1, final String input2) {
        String inputA = input1;
        String inputB = input2;
        String longestSubstring = "";

        if (input1.length() > input2.length()) {
            inputA = input2;
            inputB = input1;
        }

        // for i is the index of each character in a
        for (int i = 0; i < inputA.length(); i++) {
            // for j is each possible length of the substring of a starting from i
            for (int j = inputA.length() - i; j >= 0; j--) {
                //for k is each letter in b, -the length of the substring being searched
                for (int k = 0; k < inputB.length() - j; k++) {
                    //if input1 and input2 have matching substrings, and j > the longest substring
                    if (inputA.regionMatches(i, inputB, k, j + 1)
                        && j > longestSubstring.length()) {

                        longestSubstring = inputA.substring(i, i + j + 1);
                    }
                }
            }
        }

        return longestSubstring;
    }
}
