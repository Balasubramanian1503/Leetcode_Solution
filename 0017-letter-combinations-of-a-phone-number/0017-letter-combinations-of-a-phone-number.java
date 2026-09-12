class Solution {
    private static final String[] M = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (!digits.isEmpty()) dfs(digits, 0, "", res);
        return res;
    }
    private void dfs(String d, int i, String cur, List<String> res) {
        if (i == d.length()) { res.add(cur); return; }
        for (char c : M[d.charAt(i) - '0'].toCharArray())
            dfs(d, i + 1, cur + c, res);
    }
}