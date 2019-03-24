class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List result = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length-1;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            if(nums[i]>0) break;
            else
            {
                for(int j = i+1,k=nums.length-1;k>j;)
                {
                    if(j>i+1 && nums[j] == nums[j-1]) {j++;continue;}
                    if(nums[j]+nums[i]>0) break;
                    if(nums[i]+nums[j]+nums[k]>0) k--;
                    else if(nums[i]+nums[j]+nums[k]<0) j++;
                    else
                    {
                        List temp_list = new ArrayList();
                        temp_list.add(nums[i]);
                        temp_list.add(nums[j]);
                        temp_list.add(nums[k]);
                        result.add(temp_list);
                        j++;
                    }
                }
                    
            }
        }
        return result;
    }
}