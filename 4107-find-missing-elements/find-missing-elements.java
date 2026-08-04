class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];

        for(int i=min;i<=max;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(nums[j]==i){
                    found =true;
                    break;
                }
            }
            if(! found){
                list.add(i);
            }
        }
        return list;
    }
}