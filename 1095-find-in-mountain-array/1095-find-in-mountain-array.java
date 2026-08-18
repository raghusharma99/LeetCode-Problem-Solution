/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n= mountainArr.length();
         int peak = findPeak(mountainArr);

        int leftAnswer = ascendingSearch(mountainArr,target,0,peak);

        if (leftAnswer != -1) {
            return leftAnswer;
        }
        return descendingSearch(mountainArr,target, peak + 1,mountainArr.length() - 1);
    }

    //peak
       public int findPeak(MountainArray arr) {

        int left = 0;
        int right = arr.length() - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    //increasing
     public int ascendingSearch(MountainArray arr,int target,int left,int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);
            if (value == target) {
                return mid;
            }
            if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
     }

     //decreasing
      public int descendingSearch(MountainArray arr,int target,int left,int right) {

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);
            if (value == target) {
                return mid;
            }
            if (value > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}