class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 =0;
        
        for(int i=0; i<s.length()/2; i++){
            char ch = Character.toLowerCase(s.charAt(i));
            char c = Character.toLowerCase(s.charAt((s.length()-1)-i));
            if(ch =='a' || ch =='e' || ch=='i' || ch =='o'|| ch=='u'){
                count1++;
            }
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count2++;
            }
            
        }
        if (count1 == count2) return true;
        else return false;
    }
}