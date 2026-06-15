class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        int intervals[][] = new int[n][2];
        for(int i=0; i<n; i++)
        {
            intervals[i][0] = start[i];
            intervals[i][1] = finish[i];
        }
        
        Arrays.sort(intervals, (a,b)->a[1]-b[1]); //sort end time
        
        int activities = 1;
        int end = intervals[0][1];

        for(int i=1; i<intervals.length; i++)
        {
            if(intervals[i][0] > end)
            {
                activities++;
                end = intervals[i][1];
            }
        }
        return activities;
    }
}
