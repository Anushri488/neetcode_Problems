class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        int max_window=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            
           
            char temp=s.charAt(i);
            while(set.contains(temp)){
                set.remove(s.charAt(left));
                left++;
               
            }
            
            set.add(temp);
            max_window=Math.max(i-left+1,max_window);
            
            
        }
        return max_window;
    }
}