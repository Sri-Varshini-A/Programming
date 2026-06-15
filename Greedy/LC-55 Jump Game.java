class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int flagInd = n-1;

        for(int i=n-2; i>=0; i--)
        {
            if(i+nums[i] >= flagInd) //flag can be Reached
            {
                flagInd = i;
            }
        }
        return flagInd==0;
    }
}
