class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] pre = new int[n];
        int [] suff = new int[n];

        pre[0] = 1;
        for(int p=1; p<n; p++)
        {
            pre[p] = nums[p-1] * pre[p-1];
        }

        suff[n-1] = 1;
        for(int s = n-2; s>=0; s--)
        {
            suff[s] = nums[s+1] * suff[s+1];
        }

        int res[] = new int[n];
        for(int i=0; i<n; i++)
        {
            res[i] = pre[i] * suff[i];
        }
        return res;
    }
}
