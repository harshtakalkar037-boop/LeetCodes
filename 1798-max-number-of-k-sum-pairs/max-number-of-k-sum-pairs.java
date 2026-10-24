class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == k) {
                ans++;
                end--;
                start++;
            } else if (sum > k) {
                end--;
            } else {
                start++;
            }
        }
        return ans;
    }
}