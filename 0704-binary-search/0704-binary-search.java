class Solution {
    public int search(int[] nums, int target){
        return pos(nums, target, 0, nums.length-1);
    }

    // recursive approach for binary search 
    public int pos(int[] result, int pin, int start, int end){

        if(start>end){
            return -1;
        }
        
        int mid = start + (end-start)/2;

        if(result[mid] == pin){
            return mid;
        }
        
        if(result[mid] > pin){
            return pos(result, pin, start, mid-1);
        }
        return pos(result, pin, mid+1, end);
    }
}