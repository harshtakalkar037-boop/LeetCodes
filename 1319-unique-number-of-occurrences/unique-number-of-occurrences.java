class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> frq=new HashMap<>();
        for(int x:arr){
            frq.put(x,frq.getOrDefault(x,0)+1);
        }
        Set<Integer> set=new HashSet<>();
        for(int j:frq.values()){
            set.add(j);
        }
        return frq.size()==set.size();
    }
}