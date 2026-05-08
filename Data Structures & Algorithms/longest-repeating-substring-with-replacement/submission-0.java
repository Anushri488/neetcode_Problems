

class Solution {
    public int characterReplacement(String s, int k) {
        
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            HashMap<Character, Integer> map = new HashMap<>();
            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

               
                maxFreq = Math.max(maxFreq, map.get(ch));

                int windowLength = j - i + 1;

                if (windowLength - maxFreq <= k) {
                     maxLength = Math.max(maxLength, windowLength);
                } else {
                   break;
                }
            }
        }

        return maxLength;
    }
}
