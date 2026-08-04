class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Arrays.sort(nums);
        for(int num: nums){
            list1.add(num);
        }
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i= min; i<max; i++){
            if(! list1.contains(i)){
                list2.add(i);
            }
        }
        return list2;
    }
}