class Solution {
    int[] money;
    public int rob(int[] nums) {
        money= new int[nums.length];
        Arrays.fill(money,-1);
        return robMoney(nums,0);
    }
    public int robMoney(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(money[i]==-1){
            money[i]=Math.max((nums[i]+robMoney(nums,i+2)),robMoney(nums,i+1));
        }
        return money[i];
    }
}