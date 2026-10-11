class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> list = new ArrayList<>();

        for(int i:candies){
            
            max=Math.max(max,i);
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max){
                list.add(false);
            }else list.add(true);

            max=Math.max(max,candies[i]);
        }

        return list;
    
    }
}