class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        int prefsum=0;
        for(int n:nums){
            prefsum+=n;

           int  req=prefsum-k;

            if(map.containsKey(req)){
                count+=map.get(req);
            }

            map.put(prefsum,map.getOrDefault(prefsum,0)+1);
        }
        return count;
    }
}