class Solution {
    public int maxArea(int[] heights) {
        int max_area=0;
       for(int i=0;i<heights.length;i++){
        for(int j = i+1;j<heights.length;j++){
            int height=Math.min(heights[i],heights[j]);
            int width=j-i;
            int area=height*width;
            max_area=Math.max(max_area,area);
        }
       }
       return max_area;
}
}