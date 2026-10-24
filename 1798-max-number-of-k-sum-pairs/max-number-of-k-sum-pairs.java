
import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i : nums) {
            int req = k - i;

            if (map.containsKey(req)) {
                count++;

                int freq = map.get(req);

                if (freq == 1) {
                    map.remove(req);
                } else {
                    map.put(req, freq - 1);
                }
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        return count;
    }
}
