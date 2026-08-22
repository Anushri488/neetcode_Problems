class Solution {
    public void solve(int index,List<String>current,List<List<String>>ans,String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<s.length();i++){
            String strg=s.substring(index,i+1);
            if(ispalindrome(strg)){
                current.add(strg);
                solve(i+1,current,ans,s);
                current.remove(current.size()-1);
            }
            
        }
    }
    public boolean ispalindrome(String strg){
        int left=0;
        int right=strg.length()-1;
        while(left<right){
            if(strg.charAt(left)!=strg.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    public List<List<String>> partition(String s) {
        List<String>current = new ArrayList<>();
        List<List<String>>ans = new ArrayList<>();
        solve(0,current,ans,s);
        return ans;
    }
}
