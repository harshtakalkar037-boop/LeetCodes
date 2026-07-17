class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        n=n/2;
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;
    }
}