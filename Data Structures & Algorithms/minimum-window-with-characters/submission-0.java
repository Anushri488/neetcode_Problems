class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[]map = new int[256];
        for(char ch:t.toCharArray()){
            map[ch]++;
        }
        int left=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){
            char rchar=s.charAt(right);
            if(map[rchar]>0){
                count++;
            }
            map[rchar]--;
            
            while(count==t.length()){
                int currlen = right-left+1;
                if(currlen<minlen){
                    minlen=currlen;
                    start=left;
                }
                char lchar=s.charAt(left);
                map[lchar]++;
                if(map[lchar]>0){
                    count--;
                }
                left++;
                
            }

        }
        if(minlen==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring (start,start+minlen);
        }
    }
}
