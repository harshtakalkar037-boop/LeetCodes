class Solution {
    public String reverseVowels(String a) {
        int i = 0;
        int j = a.length() - 1;
        char[] s = a.toCharArray();

        while (i < j) {
            if (isVowel(s[i]) && isVowel(s[j])) {
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                i++;
                j--;
            } else if (!isVowel(s[i])) {
                i++;
            } else {
                j--;
            }
        }

        return new String(s);
    }

    public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
    }
}