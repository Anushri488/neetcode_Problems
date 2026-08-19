class Solution {
    public void solve(boolean[]used,List<Integer>current,List<List<Integer>>ans,int[]nums){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
            }
            if(used[i]==true){
                continue;
            }
            used[i]=true;
            current.add(nums[i]);
            solve(used,current,ans,nums);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer>current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[]used = new boolean[nums.length];
        solve(used,current,ans,nums);
        return ans;
    }
}