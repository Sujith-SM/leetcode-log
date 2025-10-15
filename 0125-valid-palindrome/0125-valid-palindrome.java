class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder reverse = new StringBuilder();
        for(int j=str.length()-1; j>=0; j--){
            reverse.append(str.charAt(j));
        }

        if(str.toString().equals(reverse.toString())) return true;
        else return false;
    }
}