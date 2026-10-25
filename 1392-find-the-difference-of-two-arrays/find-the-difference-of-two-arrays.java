class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int i:nums1) set1.add(i);
        for(int i:nums2) set2.add(i);

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int s:set1){
            if(!set2.contains(s)){
                list1.add(s);
            }
        }
        for(int s:set2){
            if(!set1.contains(s)){
                list2.add(s);
            }
        }

        return Arrays.asList(list1,list2);
    }
}