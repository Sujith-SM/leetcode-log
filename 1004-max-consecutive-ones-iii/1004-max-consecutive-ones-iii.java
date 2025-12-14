class Solution {
    public int longestOnes(int[] nums, int k) {
        int z = 0;
        int l = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == 0) {
                z++;
            }
            while(k<z){
                if(nums[l]==0) z--;
                l++;
            }
            
            if (max < i - l + 1){
                    max = i - l + 1;
            }
        }

        return max;

    }
}