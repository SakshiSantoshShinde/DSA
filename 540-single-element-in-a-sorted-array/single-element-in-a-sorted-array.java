class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                i=i+1;
            }
            else
            {
                break;
            }
        }
        return nums[i];
    }
}