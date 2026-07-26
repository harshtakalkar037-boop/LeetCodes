class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mul=1;
        int mul2=1;
        for(int i=n-1;i>n-4;i--){
            mul*=nums[i];
        }
        for(int i=0;i<2;i++){
            mul2*=nums[i];
        }
        mul2*=nums[n-1];
        return Math.max(mul,mul2);
    }
}