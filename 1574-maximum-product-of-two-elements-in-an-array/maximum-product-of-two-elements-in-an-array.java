class Solution {
    public int maxProduct(int[] nums) {
        int largest=0;
        int sec=0;

        for(int num:nums){
            if(num>largest){
                sec=largest;
                largest=num;
            }else if(num>sec){
                sec=num;
            }
        }
        return (largest-1)*(sec-1);
    }
}