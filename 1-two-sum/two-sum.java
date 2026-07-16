class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> nummap=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int comp=target-nums[i];
            if(nummap.containsKey(comp)){
                return new int []{nummap.get(comp),i};
            }
            nummap.put(nums[i],i);
        }
        return new int[]{}; //manje kahich answer nhi ahe 
    }
}