class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);

        int prefix = 0;
        long count = 0;

        for (int num : nums) {

            if (num % modulo == k) {
                prefix = (prefix + 1) % modulo;
            }

            int need = (prefix - k + modulo) % modulo;

            count += hashMap.getOrDefault(need, 0);

            hashMap.put(prefix, hashMap.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}