class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int maxWalth = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                sum = sum+accounts[i][j];   
            }
            maxWalth = Math.max(sum,maxWalth);
            sum=0;
        }
        return maxWalth;
    }
}