class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i = 1;i<nums.length+1;i++){
            boolean found = false;
            for(int num:nums){
                if(num==i){
                    found=true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return nums.length+1;
    }
}