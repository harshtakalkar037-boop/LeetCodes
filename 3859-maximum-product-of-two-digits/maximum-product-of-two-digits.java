class Solution {
    public int maxProduct(int n) {
        int mul=0;
        int max=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            int digit=n%10;
            if(digit!=0){
              arr.add(digit);
            }
            n=n/10;
        }

        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                mul=arr.get(i)*arr.get(j);
                max=Math.max(max,mul);
            }
        }
        return max;

    }
}