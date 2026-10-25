class Solution {
    public String removeStars(String s) {
        Deque<Character> q=new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                q.pop(); // remove the closest character to the left
            } else {
                q.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = q.descendingIterator();

        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}