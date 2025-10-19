class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");

       for(int i=0; i<str.length; i++){
        StringBuilder sb = new StringBuilder();
        for(int j=str[i].length()-1; j>=0; j--){
            sb.append(str[i].charAt(j));
        }
        str[i] = sb.toString();
       }
       
       StringBuilder ans = new StringBuilder();
       for(int i=0; i<str.length; i++){
            ans.append(str[i]);
            if (i<str.length-1) ans.append(" ");
        }
        return ans.toString();
    }
}