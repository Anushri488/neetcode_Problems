class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen= new HashSet<>();
        for(int numL:nums){
            seen.add(numL);
        }
        if (seen.size()!=nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}