class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int j = 0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        for(int i=0; i< nums.length; i++){
            if(nums[i]==pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        return ans;
    }
}