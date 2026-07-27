class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,k=0;
        for (int n=0;n<nums.length;n++)
        {
            if(nums[n]==0)
            {
                i++;
            }
             else if(nums[n]==1)
            {
                j++;
            }
            else if(nums[n]==2)
            {
                k++;
            }

        }
        for (int n=0;n<i;n++)
        {
            nums[n]=0;
        }   
        for (int n=i;n<j+i;n++)
        {
            nums[n]=1;
        }
        for (int n=j+i;n<j+i+k;n++)
        {
            nums[n]=2;
        }

    }
}