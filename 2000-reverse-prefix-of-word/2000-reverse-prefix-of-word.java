class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index =-1;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }
        StringBuilder result = new StringBuilder();
        if(index !=-1){
            for(int i=index; i>=0; i--){
                result.append(word.charAt(i));
            }
  
        }
        for(int j = index+1; j<word.length(); j++){
                result.append(word.charAt(j));
            }

        return result.toString();

        
    }
}