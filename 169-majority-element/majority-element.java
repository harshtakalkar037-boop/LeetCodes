class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int digit=nums.length/2;
        int no=nums[digit];

        return no;
    }
}