class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int max = 0;
        int count = 0;
        String vowels = "aeiou";

        if(s.length() == 1 && vowels.indexOf(s.charAt(0)) != -1) return 1;

        for(int right =0; right<s.length(); right++){

            if(vowels.indexOf(s.charAt(right)) != -1){
                count++;
            }

            if(k == right-left+1){
                max = Math.max(max, count);
                if(vowels.indexOf(s.charAt(left)) != -1) count--;
                left++;
            }
        }
        return max;
    }
}