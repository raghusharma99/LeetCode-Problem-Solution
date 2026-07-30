
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int[] uniqueArr = new int[freqMap.size()];
        int index = 0;
        for (int key : freqMap.keySet()) {
            uniqueArr[index++] = key;
        }
        Arrays.sort(uniqueArr);
        HashMap<Integer, Integer> map = new HashMap<>();
        int countSofar = 0;
        for (int num : uniqueArr) {
            map.put(num, countSofar);
            countSofar += freqMap.get(num);
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;

    }
}