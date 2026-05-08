class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLength = 0;
        int maxFreq = 0;        
        HashMap<Character, Integer> map = new HashMap<>();       
        for (int r = 0; r < s.length(); r++) {            
            char rightChar = s.charAt(r);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);            
            maxFreq = Math.max(maxFreq, map.get(rightChar));           
            int windowLength = r - l + 1;           
            while (windowLength - maxFreq > k) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                l++;
                windowLength = r - l + 1;
            }           
            maxLength = Math.max(maxLength, r - l + 1);
        }       
        return maxLength;
    }
}