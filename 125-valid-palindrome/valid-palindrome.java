class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        String s1=s.toLowerCase();
        while(l<r){
            if (!Character.isLetterOrDigit(s1.charAt(l))) {
                 l++;
                continue;
            }   

            if (!Character.isLetterOrDigit(s1.charAt(r))) {
                r--;
                continue;
            }
            if(s1.charAt(l)!=s1.charAt(r) ){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}