class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U') u+=1;
            if(moves.charAt(i) == 'D') d+=1;
            if(moves.charAt(i) == 'R') r+=1;
            if(moves.charAt(i) == 'L') l+=1;
        }
        if(u==d && r == l) return true;
        else return false;
    }
}