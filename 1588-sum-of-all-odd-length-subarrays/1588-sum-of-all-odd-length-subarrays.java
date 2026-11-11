class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int total = 0;
       for(int i = 0; i < arr.length; i++) {
            sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                int length = j - i + 1;

                if(length % 2 != 0) {
                    total = total + sum;
                }
            }
        }
        return total;
    }
}