class Solution {
    public String reverseWords(String s) {
        int j=s.length()-1;
        StringBuilder sb=new StringBuilder();
        while(j>=0){
            while(j>=0 && s.charAt(j)==' '){
                    j--;
                }
                if(j>=0){
                    int i=j;

                     while(j>=0 && s.charAt(j)!=' '){
                    j--;
                }

                    if(sb.length()>0){
                        sb.append(' ');
                    }
                    
                    sb.append(s.substring(j+1,i+1));

                }
        }
        return sb.toString();
    }
}