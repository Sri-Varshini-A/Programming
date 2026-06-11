class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxWater = Integer.MIN_VALUE;

        while(left<right)
        {
            int h = Math.min(height[left],height[right]);
            int b = right - left;
            int curr = h * b;
            maxWater = Math.max(maxWater,curr);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxWater;
    }
}
