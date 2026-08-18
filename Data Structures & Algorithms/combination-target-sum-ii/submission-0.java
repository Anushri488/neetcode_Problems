class Solution {
    public void solve(int target,int index,List<Integer>current,List<List<Integer>>ans,int[]candidates){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==candidates.length || target<0){
            return;
        }
        current.add(candidates[index]);
        solve(target-candidates[index],index+1,current,ans,candidates);
        current.remove(current.size()-1);
        while(index+1 < candidates.length && candidates[index]==candidates[index+1]){
            index++;
        }
        solve(target,index+1,current,ans,candidates);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(target,0,current,ans,candidates);
        return ans;
    }
}
