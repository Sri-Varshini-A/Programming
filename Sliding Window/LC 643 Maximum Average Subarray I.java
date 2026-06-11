class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
        {
            sum += nums[i];
        }
        double maxAvg = 0;
        double maxSum = sum;

        int r = k;
        int l = 0;
        while(r<nums.length)
        {
            sum = sum + nums[r] - nums[l];
            maxSum = Math.max(maxSum, sum);
            r++;
            l++;
        }
        maxAvg = maxSum/k;

        return maxAvg;
    }
}
