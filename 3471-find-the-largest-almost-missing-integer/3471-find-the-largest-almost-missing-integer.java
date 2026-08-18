class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> subarrayCount = new HashMap<>();
        for (int i = 0; i <= n - k; i++) {
            Set<Integer> uniqueInSubarray = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                uniqueInSubarray.add(nums[j]);
            }
            for (int val : uniqueInSubarray) {
                subarrayCount.put(val, subarrayCount.getOrDefault(val, 0) + 1);
            }
        }
        int maxVal = -1;
        for (Map.Entry<Integer, Integer> entry : subarrayCount.entrySet()) {
            if (entry.getValue() == 1) {
                maxVal = Math.max(maxVal, entry.getKey());
            }
        }
        return maxVal;
    }
}