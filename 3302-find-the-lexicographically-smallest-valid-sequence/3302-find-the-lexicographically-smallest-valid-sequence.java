class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] dp = new int[n + 1];
        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                j--;
            }
            dp[i] = m - 1 - j;
        }
        int[] res = new int[m];
        boolean changed = false;
        int word2Idx = 0;
        for (int i = 0; i < n && word2Idx < m; i++) {
            boolean isMatch = word1.charAt(i) == word2.charAt(word2Idx);
            if (isMatch) {
                if (dp[i + 1] >= m - 1 - word2Idx || !changed) {
                    res[word2Idx++] = i;
                }
            } else if (!changed) {
                if (dp[i + 1] >= m - 1 - word2Idx) {
                    changed = true;
                    res[word2Idx++] = i;
                }
            }
        }
        return word2Idx == m ? res : new int[0];
    }
}