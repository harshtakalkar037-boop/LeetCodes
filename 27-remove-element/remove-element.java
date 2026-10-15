class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(nums[i]==val){
                swap(nums,i,j);
                j--;
            }else if(nums[i]!=val)i++;
        }
        return j+1;

    }
    private void swap(int[] nums, int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        
   }
}