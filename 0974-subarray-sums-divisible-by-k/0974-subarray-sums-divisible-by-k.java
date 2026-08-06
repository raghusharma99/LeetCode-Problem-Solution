class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;
        int ans = 0;
        for (int num : nums) {
            prefix += num;
            int rem = ((prefix % k) + k) % k;
            ans += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}