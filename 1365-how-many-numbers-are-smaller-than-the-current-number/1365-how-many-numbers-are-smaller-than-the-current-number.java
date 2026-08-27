class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] arrr = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i]!=nums[j]&& nums[j]<nums[i]){
                    count++;
                }
                
            }
            arrr[i]=count;
            count = 0;
        }
        return arrr;
        
    }
}