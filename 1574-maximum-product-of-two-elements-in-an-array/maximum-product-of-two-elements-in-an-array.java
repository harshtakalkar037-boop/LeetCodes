class Solution {
    public int maxProduct(int[] nums) {
        int largest=nums[0];
        int sec=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                sec=largest;
                largest=nums[i];
            }else if(nums[i]>sec){
                sec=nums[i];
            }
        }
        return (largest-1)*(sec-1);
    }
}