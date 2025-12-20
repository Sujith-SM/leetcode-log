class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int max = 0;
        for(int i: gain){ 
            alt += i; 
            if(alt > max) max = alt; 
        }
        return max;
    }
}