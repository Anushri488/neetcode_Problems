class Solution {
    public void solve(int index, List<List<Integer>> ans , List<Integer>current, int[]nums){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        solve(index+1,ans,current,nums);
        current.remove(current.size()-1);
        solve(index+1,ans,current,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,ans,current,nums);
        return ans;
    }
}
