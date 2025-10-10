class Solution {
    public int findLucky(int[] arr) {
        int count = 0;
        int target = -1;
        for(int i=0; i<arr.length; i++){
            count =0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(arr[i] == count && arr[i]>target){
                target = arr[i];
            }

        }
        return target;
    }
}