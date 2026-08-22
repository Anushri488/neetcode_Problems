class Solution {
  public void solve(int index,List<Integer>current,List<List<Integer>>ans,int[]nums){
    if(index==nums.length){
      ans.add(new ArrayList<>(current));
      return;
    }
    current.add(nums[index]);
    solve(index+1,current,ans,nums);
    current.remove(current.size()-1);
    solve(index+1,current,ans,nums);
  }
    public List<List<Integer>> subsets(int[] nums) {
      List<Integer>current=new ArrayList<>();
      List<List<Integer>>ans=new ArrayList<>();
      solve(0,current,ans,nums);
      return ans;
  }
}
  