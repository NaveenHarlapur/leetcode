class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
        double max = Integer.MIN_VALUE;
        double avg=0;
        double sum =0;
        for(int i=low; i<=high; i++){
            sum = sum+nums[i]; 
        }
        while(high<nums.length){
            avg = sum/k;
            max = Math.max(max,avg);
            low++;
            high++;
            if(high==nums.length){
                break;
            }
            sum=sum-nums[low-1];
            sum=sum+nums[high];
        }
        return max;
    }
}