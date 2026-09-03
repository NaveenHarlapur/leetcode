class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int i: nums1){
            if(i%2!=0){
                min=Math.min(min,i);
            }
        }
        if(min == Integer.MAX_VALUE){
            return true;
        }

        for(int k : nums1){
            if(k%2==0 && k<=min){
                return false;
            }
        }
        return true;
    }
}