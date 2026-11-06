class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int n:nums){
            set.add(n);
        }
        for(int i:set){
            if(i >max1){
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(i>max2){
                max3 = max2;
                max2 = i;
            }else if(i>max3){
                max3 = i;
            }
        }
        if(set.size()<3){
            return max1;
        }
        return max3;
    }   
}