class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        for(int j = nums.length - 2;j>= 0;j--){             
            if(nums[j] < nums[j+1]){                            
                for(int k = nums.length - 1;j<k;k--){
                    if(nums[j] < nums[k]){                      
                        int temp = nums[k];
                        nums[k] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                reverseArray(nums,j+1,nums.length - 1);         
                return;
            }
        }
        reverseArray(nums,0,nums.length - 1);                   
    }
    private void reverseArray(int[] nums, int begin, int end){
        for(int i = begin, j = end;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
