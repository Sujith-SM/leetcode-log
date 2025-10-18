class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        
        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '0' - 1;
            String actualWord = word.substring(0, word.length() - 1);
            result[position] = actualWord;
        }
        
        
        StringBuilder sb = new StringBuilder();
        for (String word : result) {
            sb.append(word).append(" ");
        }
        
        return sb.toString().trim();
    }
}