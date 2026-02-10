class Solution {
    public int longestBalanced(int[] nums) {
        int maxlength=0;
        for(int i=0;i<nums.length;i++)
        {
            Set <Integer> Odd= new HashSet<>();
            Set <Integer> Even= new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                {
                    Even.add(nums[j]);
                }
                else
                {
                    Odd.add(nums[j]);
                }
                if(Even.size()==Odd.size())
                {
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        return maxlength;
        
    }
}