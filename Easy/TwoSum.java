//Runtime: 51 ms, faster than 34.36% of Java online submissions for Two Sum.
//Memory Usage: 39.2 MB, less than 7.87% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pos = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        throw new IllegalArgumentException("No two sums");
    }
}