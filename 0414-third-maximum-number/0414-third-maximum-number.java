class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
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
            return (int)max1;
        }
        return (int)max3;
    }   
}