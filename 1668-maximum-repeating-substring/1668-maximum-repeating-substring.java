class Solution {
    public int maxRepeating(String sequence, String word) {

        int count =0;
        StringBuilder test = new StringBuilder();
        test.append(word);
        while(sequence.contains(test.toString())){
            count++;
            test.append(word);
        }
        return count;
    }
}