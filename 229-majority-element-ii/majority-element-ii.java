class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int mini=n/3+1;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            if(map.get(nums[i])==mini){
                list.add(nums[i]);
            }

            if(list.size()==2){
                break;
            }
        }
        return list;
    }
}