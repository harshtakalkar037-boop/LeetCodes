class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int [] ans=new int[nums.length];
        int count=0;
        for(int i:nums){
            if(i!=0){
                mul*=i;
            }else count++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0 && count==0){
                ans[j]=mul/nums[j];
            }else if(count==1){
                if(nums[j]==0){
                    ans[j]=mul;
                }else ans[j]=0;
            }else ans[j]=0;
        }
        return ans;
    }
}