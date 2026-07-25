class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int result=0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i]==1){
                max++;
                result=Math.max(result,max);
            }else max=0;
        }
        return result;
    }
}