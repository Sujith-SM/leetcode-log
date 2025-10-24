class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int len = 0;
        if(word1.length() >= word2.length()){
            len = word1.length();
        }
        else{
            len = word2.length();
        }
        for(int i=0; i<=len; i++){
            if(i<word1.length()){
                result.append(word1.charAt(i));
            }
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}