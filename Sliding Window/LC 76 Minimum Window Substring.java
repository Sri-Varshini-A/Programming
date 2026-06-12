class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        {
            return "";
        }

        int remTarget = t.length();
        int freq[] = new int[128]; //all ascii (since both uppercase and lowercase letters)
        for(char ch: t.toCharArray())
        {
            freq[ch]++;
        }

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        int left=0;
        for(int right=0; right<s.length(); right++)
        {
            char ch = s.charAt(right);
            
            if(freq[ch]>0)
            {
                remTarget--;
            }
            freq[ch]--;

            while(remTarget==0)
            {
                if(right-left+1 < minLen)
                {
                    minLen = right-left+1;
                    start = left;
                }

                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0)
                {
                    remTarget++;
                }
                left++;
            }

        }
        return minLen==Integer.MAX_VALUE? "":s.substring(start,start+minLen);
    }
}
