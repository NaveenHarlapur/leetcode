class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i : nums){
            ans.put(i,ans.getOrDefault(i,0)+1);
        }        
        int maxFrequency = 0;
        int mostFrequent = 0;

        for (int key : ans.keySet()) {
            if (ans.get(key) > maxFrequency) {
            maxFrequency = ans.get(key);
            mostFrequent = key;
            }
        }

    return mostFrequent;
    }
}