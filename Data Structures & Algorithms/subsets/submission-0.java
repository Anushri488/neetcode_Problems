class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> array=new ArrayList<>();
      List<Integer> result= new ArrayList<>();
      backtrack(array,result,nums,0);
        return array;
    }
    public void backtrack(List<List<Integer>>array,List<Integer>result,int[] nums,int start){
      array.add(new ArrayList<>(result));
      for(int i= start;i<nums.length;i++){
        result.add(nums[i]);
        backtrack(array,result,nums,i+1);
        result.remove(result.size()-1);
      }
        
    }
    
}
