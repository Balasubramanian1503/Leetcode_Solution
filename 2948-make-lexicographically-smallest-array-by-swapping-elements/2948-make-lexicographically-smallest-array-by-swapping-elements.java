class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] sortedNums = new int[n][2];
        for (int i = 0; i < n; i++) {
            sortedNums[i][0] = nums[i];
            sortedNums[i][1] = i;
        }
        Arrays.sort(sortedNums, (a, b) -> Integer.compare(a[0], b[0]));
        List<List<int[]>> groups = new ArrayList<>();
        List<int[]> currentGroup = new ArrayList<>();
        currentGroup.add(sortedNums[0]);
        for (int i = 1; i < n; i++) {
            if (sortedNums[i][0] - sortedNums[i - 1][0] <= limit) {
                currentGroup.add(sortedNums[i]);
            } else {
                groups.add(currentGroup);
                currentGroup = new ArrayList<>();
                currentGroup.add(sortedNums[i]);
            }
        }
        groups.add(currentGroup);
        int[] result = new int[n];
        for (List<int[]> group : groups) {
            List<Integer> indices = new ArrayList<>();
            for (int[] pair : group) {
                indices.add(pair[1]);
            }
            Collections.sort(indices);

            for (int i = 0; i < group.size(); i++) {
                result[indices.get(i)] = group.get(i)[0];
            }
        }
        return result;
    }
}