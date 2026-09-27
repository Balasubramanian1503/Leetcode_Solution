class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int[] stack = new int[s.length()];
        int top = -1;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack[++top] = sb.length();
            } else if (c == ')') {
                int start = stack[top--];
                reverse(sb, start, sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}