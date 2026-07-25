class Solution {
    public boolean digitCount(String num) {
        long num1 = Long.valueOf(num);
        long num2 = num1;
        Map<Integer, Integer> nee = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            String s = num.charAt(i) + "";
            int tem = Integer.valueOf(s);
            nee.put(i, tem);
        }
        boolean ans = true;
        System.out.println(nee);
        for (int i1 = 0; i1 < num.length(); i1++) {
            int times = nee.get(i1);
            int check = 0;
            for (int i = 0; i < num.length(); i++) {
                String s = num.charAt(i) + "";
                int tem = Integer.valueOf(s);
                if (tem == i1) {
                    check++;
                }
            }
            if (times == check) {
                check = 0;
                continue;
            } else {
                ans = false;
                break;
            }
        }
        return ans;
    }
}