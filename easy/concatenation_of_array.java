# Problem: Concatenation of Array
# Difficulty: Easy
# Date: 2025-10-03



class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length)*2];
        for(int i = 0; i < nums.length; i++){
                    ans[i] = nums[i];
                    ans[i+nums.length] = nums[i];
            }
        return ans;
        
    }
}
