class Solution {
    public void solve(int index,int target,List<Integer> current,List<List<Integer>> ans,int[]nums){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==nums.length || target<0){
            return;
        }
        current.add(nums[index]);
        solve(index,target - nums[index],current,ans,nums);
        current.remove(current.size()-1);
        solve(index+1,target,current,ans,nums);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,target,current,ans,nums);
        return ans;

    }
}
