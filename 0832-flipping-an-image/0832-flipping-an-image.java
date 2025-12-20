class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][] result = new int[image.length][image[0].length];

        for(int row = 0; row<image.length; row++){
            for(int col = image[0].length-1; col>=0; col--){
                if(image[row][col] == 1){
                    result[row][image[0].length-col-1] = 0;
                }
                else{
                    result[row][image[0].length-col-1] = 1;
                }
            }
        }
        return result;
    }
}