class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2){
        StringBuilder sample1 = new StringBuilder();
        StringBuilder sample2 = new StringBuilder();

        for(int i=0; i<word1.length ; i++){
            sample1.append(word1[i]);
        }

        for(int i=0; i<word2.length; i++){
            sample2.append(word2[i]);
        }

        if(sample2.toString().equals(sample1.toString())) return true;
        else return false;
    }
}