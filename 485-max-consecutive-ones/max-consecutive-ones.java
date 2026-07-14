class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
                if(max>result){
                    result=max;
                }
            }else max=0;
            
        }
        return result;
    }
}