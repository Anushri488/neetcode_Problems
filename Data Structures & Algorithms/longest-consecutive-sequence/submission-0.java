class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        
        int max_count=0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){
            if(!set.contains(i-1)){
                int curr=i;
                int count=1;
                while(set.contains(curr+1)){
                    count++;
                    curr=curr+1;
                }
                max_count=Math.max(max_count,count);
            }
        }
        return max_count;
    }
}
