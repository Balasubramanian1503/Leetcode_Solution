class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans = 0;
        int push = 1;     
        while (n > 0) {
            if (n >= 8) {
                ans += 8 * push;
                n -= 8;
            } else {
                ans += n * push;
                n = 0;
            }
            push++;
        }    
        return ans;
    }
}