class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int row=0; row<grid.length; row++){
            int start = 0;
            int end = grid[row].length-1;
            int mid = 0;
            int flag =0;
            while(start <= end){
                mid = start + (end - start)/2;
                if(grid[row][mid] >= 0){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                    flag =1;
                }
            }
            if(flag == 1) count += (grid[row].length - start);
        }
        return count;
        
    }
}