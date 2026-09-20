class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int i=0;i<s.length();i++) {
            int index=s.charAt(i)-'A';
            count[index]++;
            maxFreq=Math.max(maxFreq,count[index]);
            while((i-left+1)-maxFreq>k) {
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,i-left+1);
        }
        return maxLength;
    }
}