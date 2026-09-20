class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int reverseValue = 26 -(c -'a');
            int pos = i+ 1;
            sum += reverseValue * pos; 
        }
        return sum;
    }
}