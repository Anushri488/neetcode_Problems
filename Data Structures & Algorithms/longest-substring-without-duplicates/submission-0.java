class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max_window=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character>set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char temp=s.charAt(j);
                if(set.contains(temp)){
                    break;
                }
                else{
                    set.add(temp);
                    max_window=Math.max(j-i+1,max_window);
                }
            }
        }
        return max_window;
    }
}
