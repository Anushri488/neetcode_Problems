class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int max_area=0;
        while(left<right){
            int width=right-left;
            int height=Math.min(heights[left],heights[right]);
            int area= width*height;
            max_area=Math.max(max_area,area);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
}
