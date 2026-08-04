class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        Set<List<Integer>> ans = new HashSet<>();

        int n = nums.length;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                HashSet<Long> set = new HashSet<>();

                for(int k=j+1;k<n;k++){

                    long fourth = (long)target - nums[i] - nums[j] - nums[k];

                    if(set.contains(fourth)){

                        ans.add(Arrays.asList(nums[i], nums[j], (int)fourth, nums[k]));
                    }

                    set.add((long)nums[k]);
                }
            }
        }

        return new ArrayList<>(ans);
    }
}