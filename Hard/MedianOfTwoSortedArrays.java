//Runtime: 3 ms, faster than 38.35% of Java online submissions for Median of Two Sorted Arrays.
//Memory Usage: 40.5 MB, less than 11.54% of Java online submissions for Median of Two Sorted Arrays.//

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pos1 = 0, pos2 = 0;
        int[] mergedNums = new int[nums1.length + nums2.length];
        
        for(int mI = 0; mI < mergedNums.length; mI++){
            if(mI < nums1.length){
                mergedNums[mI] = nums1[pos1];
                pos1++;
            }
            else {
                mergedNums[mI] = nums2[pos2];
                pos2++;
            }
        }
        Arrays.sort(mergedNums);
        
        if (mergedNums.length % 2 == 0) {
        int sumOfMiddleElements = mergedNums[mergedNums.length / 2] +
                                  mergedNums[mergedNums.length / 2 - 1];
        return ((double) sumOfMiddleElements) / 2;
        }
        else 
            return (double) mergedNums[mergedNums.length / 2];
    }
}